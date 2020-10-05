package list11_02;

public class Main {

	public static void main(String[] args) {

		Goblin g = new Goblin();
		Werewolf w = new Werewolf();
		DeathBat db = new DeathBat();

		g.attack();
		g.run();

		System.out.println(" ");

		w.attack();
		w.run();

		System.out.println(" ");

		db.attack();
		db.run();

	}

}
