package list10_05;

public class SuperHero extends Hero{

	boolean flying;

	//飛ぶ
	public void fly() {

		this.flying = true;
		System.out.println("飛び上がった");
	}

	public void land() {

		this.flying = false;
		System.out.println("着地した！");

	}
	//撤退する
	@Override
	public void run() {

		System.out.println(this.name + "は撤退した");

	}


}
