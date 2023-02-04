package decorator;

public class PineappleIngredient extends Decorator{

	public PineappleIngredient(Ingredient pizzaIngredient) {
		super(pizzaIngredient);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String add() {
		// TODO Auto-generated method stub
		return super.add() + " + 파인애플";
	}
}
