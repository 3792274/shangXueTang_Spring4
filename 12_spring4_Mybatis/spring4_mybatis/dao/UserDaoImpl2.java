package spring4_mybatis.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import spring4_mybatis.vo.User;

//使用继承SqlSessionDaoSupport操作,需要配置Bean,并给SqlSessionDaoSupport注入SqlSessionFactory
public class UserDaoImpl2 extends SqlSessionDaoSupport implements UserDao {
	
	 
	@Override
	public List<User> selectUser() {
		User user = new User();
		user.setName("大侠");
		user.setPwd("4444");
		
		getSqlSession().insert("spring4_mybatis.vo.user.mapper.add", user);
		getSqlSession().delete("spring4_mybatis.vo.user.mapper.remove", 1);
		
		return getSqlSession().selectList("spring4_mybatis.vo.user.mapper.selectAll");
	}

	
}
