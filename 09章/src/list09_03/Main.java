package list09_03;

public class Main {

	public static void main(String[] args) {

		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Sword s2 = new Sword();
		s2.name = "痛くないロウソク";
		s2.damage = -1;


		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;

		System.out.println("現在の武器は" + h.sword.name);

		h.sword = s2;

		System.out.println("現在の武器は" + h.sword.name);

	}

}
