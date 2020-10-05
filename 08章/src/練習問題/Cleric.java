package 練習問題;

public class Cleric {

	String cName;
	int maxHp = 50;
	int hp = 50;
	int maxMp = 10;
	int mp = 10;

	public void selfAid() {

		this.hp = 50;
		this.mp -= 5;

		System.out.println(cName + "はセルフエイドを唱えた");
		System.out.println("ヒットポイントが全快した");

	}

	public int pray(int sec) {

		int p = new java.util.Random().nextInt(3);
		int e = sec + p;

		if(this.mp + e <= 10) {
			e = sec + p;
		}else {
			e = 0;
		}

		System.out.println("僧侶は祈った");
		System.out.println("MPが" + (this.mp + e) + "になった");

		return e;

	}


}
