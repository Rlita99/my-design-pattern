package decorator;

public class Main {
	
	public static void main(String[] args) {

		Ingredient pizzaDough = new PizzaDough();

		// 자기가 감싸고 있는 구성요소의 메소드를 호출한 결과에 새로운 기능을 더함으로 행동을 확장
		Ingredient cheesePizza = new CheeseIngredient(new PizzaDough());
		Ingredient pineapplePizza = new PineappleIngredient(new CheeseIngredient(new PizzaDough()));
		Ingredient sweetpotatoPizza = new SweetpotatoIngredient(new CheeseIngredient(new PizzaDough()));
		
		System.out.println("치즈 피자  : " + cheesePizza.add());
		System.out.println("파인애플 피자 : " + pineapplePizza.add());
		System.out.println("고구마 피자 : " + sweetpotatoPizza.add());
	}

}
