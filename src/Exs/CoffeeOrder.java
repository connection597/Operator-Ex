package Exs;

public class CoffeeOrder {

	public static void main(String[] args) {
		String coffeeOrder ="Piccolo Latte";
		if(coffeeOrder =="Espresso") {
			System.out.println("would you like whipped cream on the top");
		}else if (coffeeOrder == "Piccolo Latte") {
			System.out.println("25ml or 30ml");
		}else if(coffeeOrder =="Short Macchiato") {
			System.out.println("Short or long");
		}else {
			System.out.println("Hello, we were unable to process your order");
		}
		

	}

}
