package adaptor;

public class TurkeyAdaptor implements Duck {
	Turkey t;

	 public TurkeyAdaptor( Turkey t) {
		// TODO Auto-generated constructor stub
		 this.t=t;
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		t.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		t.fly();
	}

	@Override
	public void migrate() throws UnsupportedOperationException{
		// TODO Auto-generated method stub
		throw new  UnsupportedOperationException("A Turkey can not migrate");
	}
	
	
}
