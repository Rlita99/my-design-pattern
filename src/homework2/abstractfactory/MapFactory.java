package homework2.abstractfactory;

public class MapFactory {
	public Map equipMap(String type) {
		Map map = null;
		switch (type) {
		case "A" :
			map = new AMap();
			break;
			
		case "B" : 
			map = new BMap();
			break;
		}
		return map;
	}


}
