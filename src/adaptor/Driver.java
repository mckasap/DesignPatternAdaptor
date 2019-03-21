package adaptor;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Duck d= new TurkeyAdaptor(new WildTurkey());

			d.quack();
			d.fly();
			
			d.migrate();
		
	}

}
