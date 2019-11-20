public class Soy extends CondimentDecorator {
	private Beverage beverage;

	public Soy(Beverage newBeverage){
		this.beverage = newBeverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Soy";
	}

	public double cost(){
		return .15 + this.beverage.cost();
	}
}
