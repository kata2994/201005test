package list11_13;

public class Fool extends Character implements Human{

	private int attack;

	public Fool(int hp,String name) {

		super(hp, name);

	}

	public void setAttack(int attack) {

		this.attack = attack;

	}


	public void attack(Matango m) {

		System.out.println("HPが" + m.hp + "のマタンゴに攻撃");



	}

	public void run() {

	}

	public void watch() {

	}

	public void hear() {

	}

	public void talk() {

	}

}
