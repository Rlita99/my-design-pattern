package builder;


public class MainPizzaBuilder {
		public static void main(String args[]) {
			
			PizzaBuilder pizzaBuilder = new PizzaBuilder.Builder()
					.name("고구마 피자")
					.dough("도우")
					.sauce("핫소스")
					.topping("웨지감자")
					.price(15000)
					.build();
			
			System.out.println(pizzaBuilder.toString());				
			
		}

}
