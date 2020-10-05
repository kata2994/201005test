package list14_04;

public class Hero {

	String name;
	int hp;
	public String toString() {

		return "名前：" + this.name + "/HP：" + this.hp;
	}

	//Heroは名前が一致したら同じとみなす
	@Override
	public boolean equals(Object o) {

		if(this == o) {
			//同じインスタンスである
			return true;

		}
		if(o instanceof Hero) {

			Hero h = (Hero)o;
			if(this.name.equals(h.name)) {
				//名前が一致している
				return true;
			}

		}

		return false;

	}


}
