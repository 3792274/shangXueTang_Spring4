package javaStaticProxy.RentHouse;

public class Proxy implements Rent {
	
	
	private Host host;  //代理的房主，房主有出租房屋的方法

	public Proxy() {
	}

	public Proxy(Host host) {
		this.host = host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	// 租房
	public void rent() {
		seeHouse();
		host.rent();
		fare();
	}

	// 看房
	private void seeHouse() {
		System.out.println("带房客看房");
	}

	// 收中介费
	private void fare() {
		System.out.println("收取中介费");
	}
}
