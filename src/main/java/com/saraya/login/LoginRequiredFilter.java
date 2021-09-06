	package com.saraya.login;

	import java.io.IOException;

	import javax.servlet.Filter;
	import javax.servlet.FilterChain;
	import javax.servlet.FilterConfig;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;
	import javax.servlet.annotation.WebFilter;
	import javax.servlet.http.HttpServletRequest;

	@WebFilter(urlPatterns="*.do")
	public class LoginRequiredFilter implements Filter{

		@Override
		public void destroy() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doFilter(ServletRequest servletRequest, 
				ServletResponse servletResponse, FilterChain chain)
				throws IOException, ServletException {
			// TODO Auto-generated method stub
			HttpServletRequest request = (HttpServletRequest) servletRequest;
			if(request.getSession().getAttribute("user") != null) {
				chain.doFilter(servletRequest, servletResponse);
			}else {
				request.getRequestDispatcher("/login.do").forward(servletRequest,
						servletResponse);
			}
		}

		@Override
		public void init(FilterConfig arg0) throws ServletException {
			// TODO Auto-generated method stub

	}
}
