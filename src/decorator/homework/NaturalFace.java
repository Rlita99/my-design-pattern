package decorator.homework;


// very basic Component
public class NaturalFace implements PlasticSurgery{

	@Override
	public String modify() {
		// TODO Auto-generated method stub
		return "원래는 맨 얼굴 이었엉";
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
