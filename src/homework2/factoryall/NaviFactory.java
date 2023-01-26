package homework2.factoryall;

public class NaviFactory {
	public void createNavi(String type) {
		GPSFactory gpsFactory = new GPSFactory();
		MapFactory mapFactory = new MapFactory();
		PathFinderFactory pathFinderFactory = new PathFinderFactory();
		ScreenFactory screenFactory = new ScreenFactory();
		
		gpsFactory.equipGPS(type);
		mapFactory.equipMap(type);
		pathFinderFactory.equipPathFiner(type);
		screenFactory.equipScreen(type);
		System.out.println("----- " + type + " 내비게이션 완성!");
	}
}
