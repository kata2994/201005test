package list11_14;

public class Main {

	public static void main(String[] args) {
		
		Shirt s1 = new Shirt();
		KyotoCleaningShop kcs = new KyotoCleaningShop();
		
		System.out.println(s1);
		s1 = kcs.washShirt(s1);
		System.out.println(s1.yogore);

	}

}
