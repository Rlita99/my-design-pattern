package homework2.abstractfactory;

public interface NaviFactory {
	public GPS equipGPS();
	public Map equipMap();
	public PathFinder equipPathFinder();
	public Screen equipScreen();
}
