package decorator;


// 부모클래스에 있는 메소드를 겹쳐 부르는 것
public class Decorator implements Ingredient{

	private Ingredient pizzaIngredient;
	
	public Decorator(Ingredient pizzaIngredient) {
		this.pizzaIngredient = pizzaIngredient; 
	}
	
	
	@Override
	public String add() {
		// TODO Auto-generated method stub
		return pizzaIngredient.add();
	}

}
