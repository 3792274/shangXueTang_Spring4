package spring4_mybatis.dao;

import java.util.List;

import spring4_mybatis.vo.User;
import spring4_mybatis.vo.UserMapper;

//使用第三种方式注解Spring集成Mybatis，需要配置bean.xml,添加UserMapper
public class UserDaoImpl3   implements UserDao {

	private UserMapper userMapper = null;
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	
	@Override
	public List<User> selectUser() {
		return userMapper.selectUser();
	}
	
}
