package observer.homework;

public class ADPanel implements Subscriber{

	@Override
	public void action(int floor) {
		// TODO Auto-generated method stub
		if (floor == 1) {
			System.out.println("로비 입니다.");
		} else if (floor %2 == 0) {
			System.out.println(floor + "층 : 우리회사 만세! 사장님 만세! ");
		} else {
			System.out.println("돔황챠!!!! 퇴사하세요!!!");
		}
	}

}
