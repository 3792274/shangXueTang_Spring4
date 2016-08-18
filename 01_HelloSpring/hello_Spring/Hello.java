package hello_Spring;

public class Hello {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}


	public void sayHello(){
		System.out.println("Hello~: " + name);
	}

}
