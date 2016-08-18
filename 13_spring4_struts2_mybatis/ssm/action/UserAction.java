package ssm.action;

import java.util.List;

import ssm.dao.UserService;
import ssm.vo.User;

public class UserAction {
	
	private List<User>	list;
	private UserService	userService;

	public String list() {
		list = userService.getAll();
		return "success";
	}
	
	

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
