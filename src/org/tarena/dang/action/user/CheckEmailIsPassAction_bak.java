package org.tarena.dang.action.user;

import org.tarena.dang.pojo.User;

import com.opensymphony.xwork2.Action;

public class CheckEmailIsPassAction_bak {

	private User user;

	public String execute() throws Exception {
		return Action.SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
