public class Whip extends CondimentDecorator {
	private Beverage beverage;

	public Whip(Beverage newBeverage){
		this.beverage = newBeverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip";
	}

	public double cost(){
		return .10 + this.beverage.cost();
	}
}
