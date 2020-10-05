package 練習問題;

public class Book extends TangibleAsset{

	//コンストラクタ
	public Book(String name,int price,String color,String isbn) {

		super(name,price,color,isbn);

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

	public String getIsbn() {
		return this.isbn;
	}

}
