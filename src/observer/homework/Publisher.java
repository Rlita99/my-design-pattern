package observer.homework;

public interface Publisher {
	void addComponent(Subscriber s);
	void maintainComponent(Subscriber s);
	void moveTo(int floor);

}
