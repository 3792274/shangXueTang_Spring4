package autoWiringInXML;

public class UserDaoOracleImpl implements UserDao{
	@Override
	public void getUser() {
		System.out.println("oracle获取用户数据");
	}
}