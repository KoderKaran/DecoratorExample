public class SteamedMilk extends CondimentDecorator {
	private Beverage beverage;

	public SteamedMilk(Beverage newBeverage){
		this.beverage = newBeverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Steamed Milk";
	}

	public double cost(){
		return .10 + this.beverage.cost();
	}
}
