package list10_05;

public class MagicalHero extends Hero{

	private int mp;

	public void setMp(int mp) {

		this.mp = mp;

	}

	public int getHp() {

		return this.mp;

	}


	public void fireBoll() {

		System.out.println("大人の火遊び！！");

	}

	@Override
	public void run() {

		System.out.println("俺にも帰る場所がある。。。こんなに嬉しいことはない");

	}

}
