package decorator;

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
