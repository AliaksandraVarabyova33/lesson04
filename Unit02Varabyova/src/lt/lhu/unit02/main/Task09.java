package lt.lhu.unit02.main;

public class Task09 {

	public static void main(String[] args) {

		System.out.println(calculateFunction(-4));
		System.out.println(calculateFunction(5));
		System.out.println(calculateFunction(2));

	}

	public static double calculateFunction(double arg) {

		double result;

		if (arg <= -3) {
			result = 9;
		} else if (arg > 3) {
			result = 1 / (Math.pow(arg, 2) + 1);
		} else {
			System.out.println("x is not > 3 or <= -3 - function can't be calculated");
			result = Double.NaN;
		}

		return result;

	}

}
