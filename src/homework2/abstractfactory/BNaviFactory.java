package homework2.abstractfactory;

public class BNaviFactory implements NaviFactory{

	@Override
	public GPS equipGPS() {
		return new BGPS();
	}

	@Override
	public Map equipMap() {
		return new BMap();
	}

	@Override
	public PathFinder equipPathFinder() {
		return new BPathFinder();
	}

	@Override
	public Screen equipScreen() {
		return new BScreen();
	}

}
