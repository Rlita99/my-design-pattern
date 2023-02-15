package observer.homework;

public class VoiceNotice implements Subscriber{

	@Override
	public void action(int floor) {
		// TODO Auto-generated method stub
		System.out.println(floor + "층 입니다.");
	}

}
