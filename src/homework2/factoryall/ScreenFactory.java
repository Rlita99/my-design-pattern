package homework2.factoryall;

public class ScreenFactory {

	public Screen equipScreen(String type) {
		Screen screen = null;
		switch(type) {
		case "A":
			screen = new AScreen();
			break;
		case "B":
			screen = new BScreen();
			break;
		default : 
			System.out.println("errrrrr");
		}
		return screen;
	}

}
