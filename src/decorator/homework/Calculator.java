package decorator.homework;

public class Calculator {

	   private int basicCarPrice;
	   private int airBagPrice;
	   private int naviPrice;

	   public Calculator(int basicCarPrice, int airBagPrice, int naviPrice) {
	      this.basicCarPrice = basicCarPrice;
	      this.airBagPrice = airBagPrice;
	      this.naviPrice = naviPrice;
	   }

	   public void calculate(String... data) {
	      CarComponent car = new BasicCar(this.basicCarPrice);

	      for (String decoName : data) {
	         switch (decoName) {
	         case "airbag":
	            car = new AirBagDecorator(car, this.airBagPrice);
	            break;
	         case "navi":
	            car = new NaviDecorator(car, this.naviPrice);
	            break;
	         default:
	            break;
	         }
	      }

	      System.out.println("Summary CarPrice : " + car.getSummaryPrice());
	      System.out.println("Car Info & Options : " + car.getCarInfo());
	   }

	}