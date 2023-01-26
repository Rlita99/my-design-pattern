package homework2.abstractfactory;

public class PathFinderFactory {

	public PathFinder equipPathFiner(String type) {
		PathFinder pathfinder = null;
		switch(type) {
		case "A" :
			pathfinder = new APathFinder();
			break;
		case "B" :
			pathfinder = new BPathFinder();
			break;
		}
		return pathfinder;
	}

}
