package lt.lhu.unit02.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task08 {

	public static void main(String[] args) {

		double a = 2;
		double b = 10;
		double h = 2;

		printTable(createTable(calculateFunctionArgs(a, b, h)));

	}

	public static double calculateFunctionResult(double arg) {

		double result = Math.round((2 * Math.tan(arg / 2) + 1) * 100.0) / 100.0;

		return result;
	}

	public static void printTable(Map<Double, Double> functionArgsAndResults) {

		System.out.println("| fArg | fRes |");
		System.out.println("---------------");

		for (Map.Entry<Double, Double> item : functionArgsAndResults.entrySet()) {
			System.out.println("| " + item.getKey() + " | " + item.getValue() + " |");
			System.out.println("---------------");
		}
	}

	public static List<Double> calculateFunctionArgs(double a, double b, double h) {

		List<Double> result = new ArrayList<Double>();
		result.add(a);

		double temp = a;

		while (temp < b) {
			temp = temp + h;
			result.add(temp);
		}

		return result;
	}

	public static Map<Double, Double> createTable(List<Double> functionArgs) {

		Map<Double, Double> functionArgsAndResults = new TreeMap<Double, Double>();

		for (Double arg : functionArgs) {
			functionArgsAndResults.put(arg, calculateFunctionResult(arg));
		}

		return functionArgsAndResults;

	}
}
