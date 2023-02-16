package lt.lhu.unit02.main;

import java.util.Map;
import java.util.TreeMap;

public class Task08 {

	public static void main(String[] args) {

		int a = 2;
		int b = 10;
		int h = 2;

		printTable(calculateFunction(a, b, h));

	}

	public static void printTable(Map<Integer, Double> functionArgsAndResults) {

		System.out.printf("|\t%4s\t|\t%4s\t|", "fArg", "fRes");
		System.out.println();
		System.out.println("---------------------------------");

		for (Map.Entry<Integer, Double> item : functionArgsAndResults.entrySet()) {
			System.out.printf("|\t%4d\t|\t%4.2f\t|", item.getKey(), item.getValue());
			System.out.println();
			System.out.println("---------------------------------");
		}
	}

	public static Map<Integer, Double> calculateFunction(int a, int b, int h) {

		Map<Integer, Double> functionArgsAndResults = new TreeMap<Integer, Double>();

		for (int i = a; i <= b; i = i + h) {
			double result = (2 * Math.tan(i / 2) + 1);
			functionArgsAndResults.put(i, result);
		}

		return functionArgsAndResults;
	}
}
