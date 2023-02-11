package decorator.homework;

public class FacialContouring extends PlasticSurgeon{

	public FacialContouring(PlasticSurgery plasticSurgery) {
		super(plasticSurgery);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String modify() {
		return super.modify() + " 거기다 안면 윤곽 했엉 ㅎㅎ";
	}
	
	@Override
	public int price() {
		return super.price() + 600;
	}

}
