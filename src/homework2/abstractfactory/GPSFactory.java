package homework2.abstractfactory;

public class GPSFactory {
	public GPS equipGPS(String type) {
		GPS gps = null;
		switch (type) {
		case "A" :
			gps = new AGPS();
			break;
			
		case "B" :
			gps = new BGPS();
			break;
		}
		return gps;
	}
}
