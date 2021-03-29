package decorator_pattern;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		description = "Dart Roast Coffee";
	}
	
	public double cost() {
		return .99;
	}
}
