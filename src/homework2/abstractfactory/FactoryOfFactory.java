package homework2.abstractfactory;

public class FactoryOfFactory {
	public void createNavi(String type) {
		NaviFactory naviFactory = null;
		switch(type) {
		case "A":
			naviFactory = new ANaviFactory();
			break;
		case "B":
			naviFactory = new BNaviFactory();
			break;
		}
		
		naviFactory.equipGPS();
		naviFactory.equipMap();
		naviFactory.equipPathFinder();
		naviFactory.equipScreen();
		
		System.out.println("-----" + type + " 내비 생성완료!!!");
	}
}
