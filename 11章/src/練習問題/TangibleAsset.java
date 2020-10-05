package 練習問題;

public abstract class TangibleAsset extends Asset implements Thing{

	String name;
	int price;
	String color;
	String isbn;
	String makerName;
	double g;


	//コンストラクタ
	public TangibleAsset(String name,int price,String color,String kyoutu) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.makerName = kyoutu;
		this.isbn = kyoutu;
	}

	//メソッド
	public abstract String getName();

	public abstract int getPrice();

	public abstract String getColor();

//	public abstract String getmakerName();
//
//	public abstract String getIsbn();

	public double getWeight() {

		return this.g;

	}

	public void setWeight(double g) {

		this.g = g;

	}



}
