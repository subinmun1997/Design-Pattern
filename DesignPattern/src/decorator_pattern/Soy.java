package decorator_pattern;

public class Soy extends CondimentDecorator {
	
	public Soy(Beverage beverage) {
		super(beverage);
	}
	
	public String getDesciption() {
		return super.getDescription() + ", Soy";
	}
	
	public double cost() {
		return .15 + super.cost();
	}

}
