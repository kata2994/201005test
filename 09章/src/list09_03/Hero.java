package list09_03;

public class Hero {

	String name;
	int hp;
	Sword sword;



	public void attack() {

		System.out.println(this.name + "は" + this.sword.name  + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");

	}


}
