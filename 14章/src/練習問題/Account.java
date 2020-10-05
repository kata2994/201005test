package 練習問題;

public class Account {

	String accountNumber = "4649";
	int balance = 1592;

//	public void Koza() {
//
//		this.accountNumber = "4649";
//		this.balance = 1592;
//
//	}


	@Override
	public String toString() {

		return "口座番号：" + this.accountNumber +" "+ "残高：" + this.balance + "円";

	}
	
	
	
	
	
	

}
