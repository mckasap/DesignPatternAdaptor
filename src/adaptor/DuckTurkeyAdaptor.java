package adaptor;

public class DuckTurkeyAdaptor implements Duck,Turkey {

	Duck d;
	Turkey t;
	public DuckTurkeyAdaptor(Duck d, Turkey t) {
		// TODO Auto-generated constructor stub
		this.d=d;
		this.t=t;
	}
	
	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		d.quack();
		
	}

	@Override
	public void Fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		t.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void migrate() {
		// TODO Auto-generated method stub
		
	}

	
	public void fly(int times) {
		// TODO Auto-generated method stub
		
	}

}
