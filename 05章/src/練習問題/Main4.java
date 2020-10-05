package 練習問題;

public class Main4 {

	public static void main(String[] args) {
		//5-4①
		double bottom = 10.0;
		double height = 5.0;

		System.out.println("三角形の面積を求めるお");
		System.out.println("答えは" + calctriangleArea(bottom,height) + "㎠");


		System.out.println(" ");

		//5-4②
		double radius = 5.0;
		System.out.println("円の面積を求めるお");
		System.out.println("面積は" + calcCricleArea(radius) + "㎠");

	}

	public static double calctriangleArea(double bottom, double height) {

		return bottom * height / 2;

	}


	public static double calcCricleArea(double radius) {

		return radius * radius * 3.14;

	}




}
