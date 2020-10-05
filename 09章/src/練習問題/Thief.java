package 練習問題;

public class Thief {
//9-1
	String name;
	int hp;
	int mp;

	public Thief(String name,int hp,int mp) {

		this.name = name;
		this.hp = hp;
		this.mp = mp;

	}

	public Thief(String name,int hp) {

//		this.name = name;
//		this.hp = hp;
//		this.mp = 5;
		this(name,hp,5);

	}

	public Thief(String name) {

//		this.name = name;
//		this.hp = 40;
//		this.mp = 5;
		this(name,40);

	}


}
