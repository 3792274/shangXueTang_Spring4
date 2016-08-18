package spring4_mybatis.vo;

import java.util.List;

import org.apache.ibatis.annotations.Select;

//使用第三种方式集成使用注解
public interface UserMapper {
	@Select("select * from user")
	public List<User> selectUser();
}
