package practice;

public class Main2 {

	public static void main(String[] args) {

		int[] scores = {20,30,40,50,80,55};
		int count = 0;

		for (int value : scores) {

			if (value >= 50) {
				count++;
			}

		}

		System.out.println("50点以上の科目の数は：" + count);

	}


}
