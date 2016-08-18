package spring4_mybatis.dao;

import java.util.List;

import spring4_mybatis.vo.User;

public interface UserDao {
	public List<User> selectUser(); 
}
