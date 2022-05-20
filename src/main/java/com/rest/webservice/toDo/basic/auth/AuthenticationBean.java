package com.rest.webservice.toDo.basic.auth;

public class AuthenticationBean {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public AuthenticationBean(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "AuthenticationBean [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
