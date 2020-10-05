package list10_03;

public class LegendHero extends Hero{

	private int hp;
	Marango m;


	public int getHp() {

		return this.hp;

	}

	public void setHp(int hp) {

		this.hp = hp;

	}


	public void inLow(Marango m) {

		m.setHp(100);

		System.out.println("今期、査定を楽しみにね");
		m.hp -= 10;
		System.out.println("マランゴ" + m.suffix + "のHP：" + m.hp);
		System.out.println("そういえば、２人目が生まれたそうだね？");


		if(m.getYon()) {

			System.out.println("そうか、、、出張も楽ではないからね");
			System.out.println("ま、がんばってね");
			m.hp -=90;
			System.out.println("マランゴ" + m.suffix + "のHP：" + m.hp);

		}

			System.out.println("そうか、家族構成表の申請に不備があるね。定時までに直して");
			m.hp += 2;
			System.out.println("マランゴ" + m.suffix + "のHP：" + m.hp);



	}


}
