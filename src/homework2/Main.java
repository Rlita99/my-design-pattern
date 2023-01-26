package homework2;

public class Main {
	public static void main(String args[]) {
		GPS gpsA = new AGPS();
		Screen screenA = new AScreen();
		PathFinder pathFinderA = new APathFinder();
		Map mapA = new AMap();
		
		screenA.drawMap(mapA);
		Location from = gpsA.findCurrentLocation();
		Location to = gpsA.findCurrentLocation();
		
		pathFinderA.findPath(from, to);
	}
}
