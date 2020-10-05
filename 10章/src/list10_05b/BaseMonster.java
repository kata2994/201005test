package list10_05b;

public class BaseMonster {

	private double hp;
	private double mp;
	private double atp;
	private double dfp;
	private double spp;
	private double intp;
	private char cha;

	public void setHp(double hp) {

		this.hp = hp;

	}

	public double getHp() {

		return this.hp;

	}

	public void setMp(double mp) {

		this.mp = mp;

	}

	public double getMp() {

		return this.mp;

	}

	public void setAtp(double atp) {

		this.atp = atp;

	}

	public double getAtp() {

		return this.atp;

	}

	public void setDfp(double dfp) {

		this.dfp = dfp;

	}

	public double getDfp() {

		return this.dfp;

	}

	public void setSpp(double spp) {

		this.spp = spp;

	}

	public double getSpp() {

		return this.spp;

	}

	public void setIntp(double intp) {

		this.intp = intp;

	}

	public double getCha() {

		return this.cha;

	}

	public void setCha(char cha) {

		this.cha = cha;

	}





	public void Attack(monA m) {

		double random = new java.util.Random().nextInt(4);

		double mAtk = this.atp + random;



	}

	public void Doage() {



	}

	public void noMove() {



	}


}