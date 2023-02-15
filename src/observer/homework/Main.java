package observer.homework;

public class Main {
	public static void main(String args[]) {
		Elevator ev = new Elevator();
		ADPanel ad = new ADPanel(); // 광고판
		Button button = new Button(); // 버튼
		Mirror mirror = new Mirror(); // 거울
		VoiceNotice vn = new VoiceNotice();  // 소리 알림
		
		// 엘베 부품 모으기
		ev.addComponent(button);
		ev.addComponent(mirror);
		ev.addComponent(ad);
		ev.addComponent(vn);
		
		
		// 엘베 움직이기 
		ev.moveTo(20);
		
		
		// 엘베에서 거울 수리하기
		ev.maintainComponent(mirror);
		
		// 다시 엘베 움직이기
		ev.moveTo(31);
	}

	
	
}
