package adaptor;

public class MallardDuck implements Duck{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("QUACK QUACK");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I'm flying ");
	}

	@Override
	public void migrate() {
		// TODO Auto-generated method stub
		System.out.println("It's time to move on hotter places");
	}

}
