package 練習問題;

public class Main {

	public static void main(String[] args) {
		/*
		 * 4-1
		 * ① int[] points = new int[3];
		 * ② double[] weights = new double[5];
		 * ③ boolean[] answers = new boolean[3];
		 * ④ String[] names = new String[3];
		 * 
		 * 4-2
		 * ①  と　③
		 */
			int[] moneyList = {121902,8302,55100};
			
			for(int test : moneyList) {
				
				System.out.println(test);
				
			}
			//②
			System.out.println("");
			
			for(int i = 0; i < moneyList.length; i++) {
				
				System.out.println(moneyList[i]);
				
			}
			
			System.out.println("");
			
			
			
			
			//4-3
			int[]counts = null;
			float[] heights = {171.3F,175.0F};
			//System.out.println(counts[1]);
			//System.out.println(heights[2]);
			
			
			
			System.out.println("");
			
			
			
			//4-4
			//①
			//int[] numbers = new int[3];
			int[] numbers = {3,4,9};
			System.out.println("1桁の数字を入力してください");
			int input = new java.util.Scanner(System.in).nextInt();
			
//			if(true) {
//				if(input == numbers[0] || input == numbers[1] || input == numbers[2]){
//					System.out.println("アタリ");
//				} else {
//					System.out.println("ハズレ");
//					}
//			}
			
			for(int i = 0; i < numbers.length; i++) {
				
				if(input == numbers[0]){
					System.out.println("アタリ");
					break;
				} else if(input == numbers[1]) {
					System.out.println("アタリ");
					break;
					} else if(input == numbers[2]) {
						System.out.println("アタリ");
						break;
						}else {
							System.out.println("はずれ");
						}
				
			}
			
			
			
			
//			switch(input) {
//			case 3:
//				System.out.println("アタリ");
//				break;
//			case 4:
//				System.out.println("アタリ");
//				break;
//			case 9:
//				System.out.println("アタリ");
//				break;
//			default:
//				System.out.println("ハズレ");
//			}
			
	}

}
