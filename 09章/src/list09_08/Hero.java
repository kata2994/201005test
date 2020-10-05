package list09_08;

public class Hero {

	String name;
	int hp;

	//コンストラクタ
	public Hero(String name){
		this.hp = 100;
		this.name = name;
	}

	public Hero(){

	}






	public void sleep() {

		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");

	}

	public void sit(int sec) {

		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("Hpが" + sec + "ポイント回復した");

	}

	public void slip() {

		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}

	public void run() {

		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("ゲームオーバー");
		System.out.println("最終HPは" + this.hp + "でした");
	}

}
