package list13_01;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero();
		h.name = "ミナト";
		//h.hp = 100;

		Inn in = new Inn();
		in.checkIn(h);
		System.out.println("宿屋にとまった後のHP:100");

		King king = new King();
		king.talk(h);

	}

}
