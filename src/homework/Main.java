package homework;

public class Main {
	public static void main(String[] args) {
		Motor A = new AMotor();
		
		ElevatorController controller1 = new ElevatorController(1, A);
		controller1.gotoFloor(5);
		controller1.gotoFloor(3);
		
		Motor B = new BMotor();
		
		ElevatorController controller2 = new ElevatorController(2, B);
		controller2.gotoFloor(5);
		controller2.gotoFloor(3);
	}

}
