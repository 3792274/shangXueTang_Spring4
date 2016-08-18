package spring4_mybatis.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import spring4_mybatis.vo.User;

public class UserDaoImpl implements UserDao {
	
	
	private SqlSessionTemplate sqlSession;
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	

	@Override
	public List<User> selectUser() {
		User user = new User();
		user.setName("大侠");
		user.setPwd("4444");
		
		sqlSession.insert("spring4_mybatis.vo.user.mapper.add", user);
		sqlSession.delete("spring4_mybatis.vo.user.mapper.remove", 1);
		
		return sqlSession.selectList("spring4_mybatis.vo.user.mapper.selectAll");
	}

	
}
