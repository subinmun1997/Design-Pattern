package strategy_pattern;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		Duck rubberDukie = new RubberDuck();
		Duck decoy = new DecoyDuck();
		Duck model = new ModelDuck();
		
		mallard.performQuack();
		rubberDukie.performQuack();
		decoy.performQuack();
		
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
