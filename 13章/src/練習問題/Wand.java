package 練習問題;

public class Wand {

	 private String name;
	 private double power;


	public String getName() {

		return this.name;

	}

	public void setName(String name) {

		if(name.length() < 3 || name == null) {
			throw new IllegalArgumentException
			("名前は三文字以上にしてね");

		}

		this.name = name;

	}

	public double getPower() {

		return this.power;

	}

	public void setPower(double power) {

		this.power = power;

		if(0.5 > power) {

			throw new IllegalArgumentException
			("杖のパワーは0.5以上にしてね");

		}else if(100 < power) {

			throw new IllegalArgumentException
			("杖のパワーは100以下にしてね");

		}

	}


}
