public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage newBeverage){
		this.beverage = newBeverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}

	public double cost(){
		return .20 + this.beverage.cost();
	}
}
