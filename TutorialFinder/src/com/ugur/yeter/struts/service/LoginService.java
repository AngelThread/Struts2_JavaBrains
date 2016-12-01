package com.ugur.yeter.struts.service;

import com.ugur.yeter.struts.model.User;

public class LoginService {

	public boolean loginServiceVerifyLogin(User user) {
		if (user.getUserId().equalsIgnoreCase("userId") && user.getPassword().equalsIgnoreCase("password"))
			return true;
		else
			return false;
	}
}
