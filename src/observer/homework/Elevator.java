package observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Elevator implements Publisher{
	
	private List<Subscriber> subscribers = new ArrayList<>();
	

	@Override
	public void addComponent(Subscriber s) {
		// TODO Auto-generated method stub
		subscribers.add(s);
	}

	@Override
	public void maintainComponent(Subscriber s){
		// TODO Auto-generated method stub
		subscribers.remove(s);
	}

	@Override
	public void moveTo(int floor) {
		for (Subscriber subscriber : subscribers) {
			subscriber.action(floor);
		}
		
	}
	
}
