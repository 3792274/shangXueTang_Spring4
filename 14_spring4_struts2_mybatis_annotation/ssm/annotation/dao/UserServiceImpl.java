package ssm.annotation.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.annotation.dao.UserDao;
import ssm.annotation.dao.UserService;
import ssm.annotation.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> getAll() {
		return userDao.getAll();
	}
}
