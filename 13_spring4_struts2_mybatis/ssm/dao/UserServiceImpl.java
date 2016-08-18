package ssm.dao;

import java.util.List;

import ssm.vo.User;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	

	public List<User> getAll() {
		User user = new User();
		user.setName("pppp");
		user.setPwd("222");
		
		userDao.add(user);
		userDao.remove(40);
		return userDao.getAll();
	}
}
