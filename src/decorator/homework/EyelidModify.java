package decorator.homework;

public class EyelidModify extends PlasticSurgeon{

	
	// super 형으로 자동 생성되는 것에 대하여 "상속" 공부 더하기
	public EyelidModify(PlasticSurgery plasticSurgery) {
		super(plasticSurgery);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String modify() {
		// TODO Auto-generated method stub
		return super.modify() + " 거기다 쌍커풀 수술을 했어";
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return super.price() + 50;
	}

}
