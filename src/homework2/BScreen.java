package homework2;

public class BScreen extends Screen{

	@Override
	public void drawMap(Map map) {
		System.out.println("Draw map" + map.getClass().getName() + "on A Screen");
	}

}
