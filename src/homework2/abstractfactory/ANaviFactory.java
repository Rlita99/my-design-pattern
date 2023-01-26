package homework2.abstractfactory;

public class ANaviFactory implements NaviFactory{

	@Override
	public GPS equipGPS() {
		return new AGPS();
	}

	@Override
	public Map equipMap() {
		return new AMap();
	}

	@Override
	public PathFinder equipPathFinder() {
		return new APathFinder();
	}

	@Override
	public Screen equipScreen() {
		return new AScreen();
	}

}
