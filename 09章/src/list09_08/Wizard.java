package list09_08;

public class Wizard {

	String name;
	int hp;

	public Wizard(String name,int hp) {

		this.name = name;
		this.hp = hp;

		System.out.println("私は" + name + "HPは" + hp + "だ");
		System.out.println("直帰します");

	}



	public void heal(Hero h) {

		h.hp += 10;
		System.out.println
		(h.name + "のHPを10回復した！");

	}


}
