package list09_08;

public class Main {

	public static void main(String[] args) {


		Hero hex = new Hero();

		Hero h = new Hero("ミナト");
		//System.out.println(h.hp);
		System.out.println(h.name);

		Hero h2 = new Hero("あさか");
		System.out.println(h2.name);

		Hero h3 = new Hero("スガワラ");
		System.out.println(h3.name);

		Marango m = new Marango(100,'A');
		//System.out.println("HPが" + m.hp + "の" + "マランゴ" + m.suffix + "が現れた");

		Wizard w = new Wizard("すがわら",50);


	}

}
