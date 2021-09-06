package com.saraya.login;

public class UserValidation {
	public boolean isValid(String name, String password) {
		if (name.equalsIgnoreCase("konate") && password.equals("becaye")) {
			return true;
		}
		return false;
	}
}
