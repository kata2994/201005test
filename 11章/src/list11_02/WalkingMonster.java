package list11_02;

public abstract class WalkingMonster extends Monster{

	public abstract void attack();

	@Override
	public void run() {

		System.out.println("トコトコ逃げる");

	}


}
