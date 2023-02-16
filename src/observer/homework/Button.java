package observer.homework;

public class Button implements Subscriber{

	@Override
	public void action(int floor) {
		// TODO Auto-generated method stub
		System.out.println(floor + "층이 눌렸습니다.");
	}

}
