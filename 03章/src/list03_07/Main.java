package list03_07;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
//			System.out.println("ピザ");
			int fortune = new java.util.Random().nextInt(4) + 1;
			
			switch(fortune) {
				case 1:
					System.out.println("大吉");
					break;
				case 2:
					System.out.println("中吉");
					break;
				case 3:
					System.out.println("吉");
					break;
				default:
					System.out.println("凶");
			
			
		}
//		System.out.println("おばあちゃんが雨季に水が溜まりやすい箇所は？");
//		String anser = new java.util.scanner(System.in).nextLine();
	}

	}
}