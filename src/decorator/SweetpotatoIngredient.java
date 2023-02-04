package decorator;

public class SweetpotatoIngredient extends Decorator{

	public SweetpotatoIngredient(Ingredient pizzaIngredient) {
		super(pizzaIngredient);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String add() {
		// TODO Auto-generated method stub
		return super.add() + " + 고구마";
	}
}
