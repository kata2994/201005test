package practice;

public class Main {

	public static void main(String[] args) {

		int[] randam = new int[3];

//		int a = new java.util.Random().nextInt(10);
//		int b = new java.util.Random().nextInt(10);
//		int c = new java.util.Random().nextInt(10);

		//int [] randam = {a,b,c};
		//System.out.println(a + " " + b + " " + c);

		randam[0] = new java.util.Random().nextInt(10);
		randam[1] = new java.util.Random().nextInt(10);
		randam[2] = new java.util.Random().nextInt(10);

		System.out.println(randam[0] + " "+ randam[1] + " "+ randam[2]);

	}

}
