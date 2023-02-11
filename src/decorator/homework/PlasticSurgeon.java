package decorator.homework;

// Decorator
public class PlasticSurgeon implements PlasticSurgery{
	
	private PlasticSurgery plasticSurgery;
	
	public PlasticSurgeon(PlasticSurgery plasticSurgery) {
		this.plasticSurgery = plasticSurgery;
	}

	@Override
	public String modify() {
		// TODO Auto-generated method stub
		return plasticSurgery.modify();
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return plasticSurgery.price();
	}

}
