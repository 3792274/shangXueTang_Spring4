package useSpringExample;


public class MySqlDaoImpl implements UserDao {

	@Override
	public void getUser() {
		System.out.println("MySQL-DAO-GetUser()");
	}

}
