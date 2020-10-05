package 練習問題;

public class Computer extends TangibleAsset{


	//コンストラクタ
	public Computer(String name,int price,String color,String makerName) {

		super(name,price,color,makerName);

	}

	//メソッド
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public int getPrice() {
		return this.price;
	}
	@Override
	public String getColor() {
		return this.color;
	}

	public String getmakerName() {
		return this.makerName;
	}


}
