package homework;

public abstract class Motor {
	private MotorStatus motorStatus;
	
	public MotorStatus getMotorStatus() {
		return motorStatus;
	}
	
	public void setMortorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	
	public void move(Direction direction) {
		MotorStatus motorStatus = this.getMotorStatus();
		if (motorStatus == motorStatus.MOVING)
			return;
		moveMotor(direction);
		setMortorStatus(MotorStatus.MOVING);
	}
	
	abstract void moveMotor(Direction direction);
	
	public void stop() {
		motorStatus = MotorStatus.STOPPED;
	}
}
