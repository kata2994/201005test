package list12_05;

public class Main {

	public static void main(String[] args) {

		Slime s = new Slime();
		Monster m = new Slime();
		Matango m2 = new Matango();
		
		
//		s.run();
//		m.run();
		
		escape(s);
		escape(m);
		escape(m2);
		

	}
	
	
	public static void escape(Monster m) {
		
		m.run();
		
	}
	

}
