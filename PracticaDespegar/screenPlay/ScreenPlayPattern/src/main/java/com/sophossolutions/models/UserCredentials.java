package com.sophossolutions.models;

import com.sophossolutions.utils.Constants;

public class UserCredentials {

	Constants user;
	Constants password;

	public UserCredentials(Constants user, Constants password) {
		super();
		this.user = user;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return Constants.getData("user")+Constants.getData("pass");
	}

	public Constants getUser() {
		return user;
	}

	public void setUser(Constants user) {
		this.user = user;
	}

	public Constants getPassword() {
		return password;
	}

	public void setPassword(Constants password) {
		this.password = password;
	}
	
	


}
