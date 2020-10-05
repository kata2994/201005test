package list04_11;

public class Main2 {

	public static void main(String[] args) {

		int [] test = new int[3];

//		test[0] = new java.util.Random().nextInt(10);
//		test[1] = new java.util.Random().nextInt(10);
//		test[2] = new java.util.Random().nextInt(10);

		for (int i =0; i < test.length; i++) {

		test[i] = new java.util.Random().nextInt(10);

		System.out.println(test[i]);

		}
	}

}
