package list05_08;

public class Main2 {

	public static int Add(int a, int b) {

		int addans = a + b;
		return addans;
	}

	public static int Draw(int c, int d) {

		int drawans = c - d;
		return drawans;

	}

	public static double Multi(double e, double f) {

		double multi = e * f;
		return multi;

	}

	public static double Divi(double g, double h) {

		double divi = g / h;
		return divi;

	}


	public static void main(String[] args) {

		System.out.println("計算方法を選んでお");
		System.out.println("1: 足し算 2: 引き算 3: 掛け算 4: 割り算");
		int z = new java.util.Scanner(System.in).nextInt();

		switch(z) {

		case 1:
			System.out.println("足し算するお！");
			int a = new java.util.Scanner(System.in).nextInt();
			System.out.println("+");
			int b = new java.util.Scanner(System.in).nextInt();
			System.out.print(a + "+" + b + "=");
			System.out.println(Add(a,b));
			break;

		case 2:
			System.out.println("引き算するお！");
			int c = new java.util.Scanner(System.in).nextInt();
			System.out.println("-");
			int d = new java.util.Scanner(System.in).nextInt();
			System.out.print(c + "-" + d + "=");
			System.out.println(Draw(c,d));
			break;

		case 3:
			System.out.println("掛け算するお！");
			double e = new java.util.Scanner(System.in).nextInt();
			System.out.println("ｘ");
			double f = new java.util.Scanner(System.in).nextInt();
			System.out.print(e + "x" + f + "=");
			System.out.println(Multi(e,f));
			break;

		case 4:
			System.out.println("割り算するお！");
			double g = new java.util.Scanner(System.in).nextInt();
			System.out.println("÷");
			double h = new java.util.Scanner(System.in).nextInt();
			System.out.print(g + "x" + h + "=");
			System.out.println(Divi(g,h));
			break;

		}


	}

}
