package builder;

public class PizzaBuilder {

	private  String name;
	private  String dough;
	private  String sauce;
	private  String topping;
	private  int price;
	
	public PizzaBuilder(Builder builder) {
		this.name = builder.name;
		this.dough = builder.dough;
		this.sauce = builder.sauce;
		this.topping = builder.topping;
		this.price = builder.price;
	}	
	
	public static class Builder {
		private String name;
		private String dough;
		private String sauce;
		private String topping;
		private int price;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder dough(String dough) {
			this.dough = dough;
			return this;
		}
		
		public Builder sauce(String sauce) {
			this.sauce = sauce;
			return this;
		}
		
		public Builder topping(String topping) {
			this.topping = topping;
			return this;
		}
		
		public Builder price(int price) {
			this.price = price;
			return this;
		}
		
		public PizzaBuilder build() {
			return new PizzaBuilder(this);
		}
	}
	

	
	
}
