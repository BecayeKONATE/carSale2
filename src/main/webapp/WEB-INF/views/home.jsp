<%@ include file="../common/head.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	<h1>Welcome ${user } here are the formations which we are doing :</h1><br>
	<h2>${formats }</h2>
	<ol>
		<c:forEach items="${formats }" var="format">
			<li>${format.name } &nbsp; &nbsp; 
			<a href="/delete.do?formation=${format.name}">Delete</a>
			</li>
		</c:forEach>
	</ol>
	<form action="formation.do" method="post">
		<input type="text" name="add">
		<input type="submit" value="add formation" required>
	</form>
	<%@ include file="../common/footer.jspf" %>
