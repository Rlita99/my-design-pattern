package builder;

public class PizzaBuilder {

	private  String name;
	private  String dough;
	private  String sauce;
	private  String topping;
	private  int price;
	
	// 객체 생성 전, 값을 세팅해줄 Builder 내부 클래스
	public static class Builder {
		private String name;
		private String dough;
		private String sauce;
		private String topping;
		private int price;
		
		public Builder() {
			
		}
		
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
		
		// 값 세팅이 끝난 후 내부 클래스를 넘겨주어 본 객체에 값을 세팅해주는 메소드
		public PizzaBuilder build() {
			return new PizzaBuilder(this);
		}
	}
	
	// 값 세팅이 끝난 후 내부 클래스를 넘겨주어 본 객체에 값을 생성해주는 메서드
	public PizzaBuilder(Builder builder) {
		this.name = builder.name;
		this.dough = builder.dough;
		this.sauce = builder.sauce;
		this.topping = builder.topping;
		this.price = builder.price;
	}	
	
	public String toString() {
        return "name: " + name + ", " + "dough: " + dough + ", " + "sauce: " + sauce + ", " + "topping: " + topping + ", " + "price: " + price;
    }		
}
