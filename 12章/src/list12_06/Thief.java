package list12_06;

public class Thief extends Character{

	@Override
	public void attack(Monster m) {

		System.out.println(this.name + "の攻撃");
		System.out.println("マタンゴに３ポイントのダメージを与えた");
		m.hp -= 3;

	}


}
