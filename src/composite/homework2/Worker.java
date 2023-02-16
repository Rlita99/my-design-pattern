package composite.homework2;

public class Worker implements CommonInterface {
	private String name;
	private String job;
	
	public Worker(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public void say() {
		System.out.println("나는 " + name + "(이)야. 나는 " + job + "야.");
		
	}
	
}
