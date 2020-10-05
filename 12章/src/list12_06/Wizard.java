package list12_06;

public class Wizard extends Character{

	@Override
	public void attack(Monster m) {

		System.out.println(this.name + "の攻撃");
		System.out.println("マタンゴに２のダメージを与えた");
		m.hp -= 2;


	}

}
