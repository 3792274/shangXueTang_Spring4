package javaStaticProxy.RentHouse;


//需要租房的租客，租客到房屋中介租房，房屋中介代理房主提供租房 ，并中介自行添加看房，收费等方法
public class ClientTest {
	public static void main(String[] args) {
		
		Host host = new Host();
		
		Proxy proxy = new Proxy(host);
		
		proxy.rent();
		
	}
}
