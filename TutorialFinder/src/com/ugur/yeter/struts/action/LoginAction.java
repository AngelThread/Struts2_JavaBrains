package com.ugur.yeter.struts.action;

import org.apache.commons.lang.StringUtils;

// import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ugur.yeter.struts.model.User;
import com.ugur.yeter.struts.service.LoginService;

// public class LoginAction implements Action{
public class LoginAction extends ActionSupport  implements ModelDriven{

	private User user = new User();

	// @Override it is for Action interface which we implemented
	public String execute() {
		LoginService loginService = new LoginService();
		// user = new User();
		// user.setUserId("userId");
		// user.setPassword("password");

		if (loginService.loginServiceVerifyLogin(user))
			return SUCCESS;
		else
			return INPUT;
	}

	@Override
	public void validate() {
		if (StringUtils.isEmpty(user.getUserId())) {
			addFieldError("userId", "User Id cannot be blank");
		}
		if (StringUtils.isEmpty(user.getPassword())) {
			addFieldError("password", "Password cannot be blank");
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
