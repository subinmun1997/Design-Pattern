package decorator_pattern;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}
	
	public String getDiscription() {
		return super.getDescription() + ", Mocha";
	}
	
	public double cost() {
		return .20 + super.cost();
	}
}
