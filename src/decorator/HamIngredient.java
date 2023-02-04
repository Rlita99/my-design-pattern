package decorator;

public class HamIngredient extends Decorator{

	public HamIngredient(Ingredient pizzaIngredient) {
		super(pizzaIngredient);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String add() {
		// TODO Auto-generated method stub
		return super.add() + " + 햄";
	}
	
}
