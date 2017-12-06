package org.tarena.dang.action.user;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.util.Constant;

public class LogoutAction extends BaseAction{
    public String execute(){
    	session.remove(Constant.USER);
    	return "success";
    }
}
