package adaptor;

public class DuckAdaptor  implements Turkey{

	Duck d;
	public DuckAdaptor(Duck d) {
		
		this.d=d;
		
		
	}
	
	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		d.quack();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		d.fly();
	}

	@Override
	public void Fight() throws UnsupportedOperationException{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("A duck can not Fight");
	}

}
