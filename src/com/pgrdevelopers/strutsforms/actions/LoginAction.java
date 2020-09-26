package com.pgrdevelopers.strutsforms.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7821146026579413921L;
	
	String email;
	String password;
	
	public LoginAction() {
        System.out.println("constructor of LoginAction");
    }
 
	
	@Override
	public String execute() {
		System.out.println("Inside Login Action execute method");
		return SUCCESS;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
