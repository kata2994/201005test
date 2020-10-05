package 練習問題;
//13-1,13-3
public class Wizard {

	private int hp;
	private int mp;
	private String name;
	private Wand wand;


	public void setName(String name) {

		this.name = name;

		if(name.length() < 2) {
			throw new IllegalArgumentException
			("3文字以上の名前にして。");
		}

	}

	public String getName() {

		return this.name;

	}

	public void setHp(int hp) {

		this.hp = hp;

		if(this.hp < 0) {

			this.hp = 0;

		}

	}

	public int getHp() {

		return this.hp;

	}

	public void setMp(int mp) {

		this.mp = mp;

		if(this.mp < 0) {

			this.mp = 0;

		}

	}

	public int getMp() {

		return this.mp;

	}

	public void setWand(Wand w) {

		if(w == null) {

			throw new IllegalArgumentException
			("杖を装備してください");

		}

		this.wand = w;

	}

	public Wand getWand() {

		return wand;

	}


//	public double getWand() {
//
//		return this.wand;
//
//	}







	void heal(Hero h) {

		int basePonit = 10;
		int recovPoint = (int)(basePonit * this.getWand().getPower());

		h.setHp(h.getHp() + recovPoint);

		System.out.println(h.getName() + "HPを" + recovPoint + "回復した！");

	}
//13-2 HeroクラスにWidzardで参照するためのゲッターとセッター、フィールドが無かったから。





}
