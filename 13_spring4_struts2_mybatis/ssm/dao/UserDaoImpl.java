package ssm.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import ssm.vo.User;

//如果继承SqlSessionDaoSupport,则需要配置UserDaoImpl加入SqlSessionFactory依赖
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	public List<User> getAll() {
		return this.getSqlSession().selectList("ssm.vo.user.mapper.getAll");
	}

	public int add(User user) {
		return this.getSqlSession().insert("ssm.vo.user.mapper.add", user);
	}

	public int remove(int id) {
		return this.getSqlSession().delete("ssm.vo.user.mapper.remove", id);
	}
}
