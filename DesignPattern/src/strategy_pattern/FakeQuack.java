package strategy_pattern;

public class FakeQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Qwak");
	}

}
