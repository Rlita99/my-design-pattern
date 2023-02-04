package decorator;

public class CheeseIngredient extends Decorator{

	public CheeseIngredient(Ingredient pizzaIngredient) {
		super(pizzaIngredient);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String add() {
		// TODO Auto-generated method stub
		return super.add() + " + 치즈";
	}
	
}
