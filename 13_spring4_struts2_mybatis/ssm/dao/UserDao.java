package ssm.dao;

import java.util.List;

import ssm.vo.User;


public interface UserDao {
	
	public List<User> getAll();

	public int add(User user);

	public int remove(int id);
}
