package list11_13;

public class Character {

	private int hp;
	private String name;


	public void setHp(int hp) {

		if(101 > hp && 0 < hp) {
			this.hp = hp;
		}


	}

	public int getHp() {

		return this.hp;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getName() {

		return this.name;

	}






	public Character(int hp,String name){

		this.hp = hp;
		this.name = name;


	}

}
