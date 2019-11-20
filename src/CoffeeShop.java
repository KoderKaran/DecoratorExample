public class CoffeeShop {
	public static void main(String[] args){
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);

		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
