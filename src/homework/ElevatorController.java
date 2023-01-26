package homework;

public class ElevatorController {
	private int id;
	private int currentFloor = 1;
	private Motor motor;
	
	public ElevatorController(int id, Motor motor) {
		this.id = id;
		this.motor = motor;
	}
	
	public void gotoFloor(int destination) {
		if (destination == currentFloor)
			return;
	}
	
	Direction direction;
	
	if (destination > currentFloor) {
		direction = Direction.UP;
	} else {
		direction = Direction.DOWN;
	}
	
	System.out.println("Starting Elevator [" + id + "] Start Floor : " + currentFloor);
	currentFloor = destination;
	
	System.out.println("=>> Now Floor: " + currentFloor + " motor : " + motor.getClass().getName());
	
	motor.stop();

}

