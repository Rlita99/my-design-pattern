package composite.homework2;

import java.util.ArrayList;

public class Dept implements CommonInterface{
	private String name;
	private ArrayList<Worker> workers = new ArrayList<>();
	
	public Dept(String name) {
		this.name = name;
	}
	
	public void addWorkers(Worker worker) {
		workers.add(worker);
	}
	
	public void removeWorkers(Worker worker) {
		workers.remove(worker);
	}
	
	@Override
	public void say() {
		System.out.println("부서 : " + name);
	}
	
	public void sayWokrers() {
		System.out.println("부서원 : ");
		for (Worker worker : workers){
			worker.say();
		}
		
	}
	
}
