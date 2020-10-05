package list13_08;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero();
		h.setName("ミナト");
		h.setHp(100);

		Inn in = new Inn();
		in.checkIn(h);
		System.out.println("宿屋にとまった後のHP:" + h.getHP());

		King king = new King();
		king.talk(h);

	}

}
