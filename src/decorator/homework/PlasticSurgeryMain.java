package decorator.homework;

public class PlasticSurgeryMain {
	public static void main(String args[]) {
		PlasticSurgery modifyAll = new EyelidModify
				(new BoobModify
						(new FacialContouring
								(new NaturalFace())));
		System.out.println(modifyAll.modify());
		System.out.println("총 " + modifyAll.price()+ " 만원 들었엉");
	}
}
