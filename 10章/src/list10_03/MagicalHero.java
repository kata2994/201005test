package list10_03;

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


}
