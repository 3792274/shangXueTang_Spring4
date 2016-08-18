package javaStaticProxy.RentHouse;

//房主完成出租房屋方法
public class Host implements Rent {
	public void rent() {
		System.out.println("房屋出租");
	}
}
