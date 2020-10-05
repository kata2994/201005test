package list12_06;

public abstract class Character {

	int hp;
	String name;

	public void run(){
		System.out.println("すべてが無理になった");
	}

	public abstract void attack(Monster m);


}
