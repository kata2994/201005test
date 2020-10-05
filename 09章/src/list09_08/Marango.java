package list09_08;

public class Marango {

	int hp;
	final int LEVEL = 10;
	char suffix;

	public Marango(int hp,char suf) {

		this.hp = hp;
		this.suffix = suf;

		System.out.println("マランゴ" + suf + "が現れた");
		System.out.println("HPは" + hp + "の様だ");

	}


	public void run() {

		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");

	}




}
