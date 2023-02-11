package decorator.homework;

public class BoobModify extends PlasticSurgeon{

	public BoobModify(PlasticSurgery plasticSurgery) {
		super(plasticSurgery);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String modify() {
		return super.modify() + " 거기에 D 컵이 됏엉";
	}
	
	@Override
	public int price() {
		return super.price() + 800;
	}

}
