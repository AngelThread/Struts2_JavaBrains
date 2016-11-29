package com.ugur.yeter.struts.action;

import org.apache.commons.lang.StringUtils;

// import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import freemarker.template.utility.StringUtil;

// public class LoginAction implements Action{
public class LoginAction extends ActionSupport {

	private String userId;
	private String password;

	// @Override it is for Action interface which we implemented
	public String execute() {

		if (getUserId().equalsIgnoreCase("userId") && getPassword().equalsIgnoreCase("password"))
			return SUCCESS;
		else
			return INPUT;
	}

	@Override
	public void validate() {
		if (StringUtils.isEmpty(getUserId())) {
			addFieldError("userId", "User Id cannot be blank");
		}
		if (StringUtils.isEmpty(getPassword())) {
			addFieldError("password", "Password cannot be blank");
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
