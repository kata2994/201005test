package list11_02;

public abstract class FlyingMonster extends Monster{

	public abstract void attack();

	@Override
	public void run() {

		System.out.println("バサバサ飛んで逃げる");

	}


}
