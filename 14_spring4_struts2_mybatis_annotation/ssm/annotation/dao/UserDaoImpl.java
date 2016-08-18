package ssm.annotation.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssm.annotation.dao.UserDao;
import ssm.annotation.vo.User;

@Repository("userDao") 
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
	
	
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	
	public List<User> getAll() {
		return this.getSqlSession().selectList("ssm.annotation.vo.user.mapper.getAll");
	}
}
