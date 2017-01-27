package stopwatch;

import java.math.BigDecimal;

/**
 * This is for testing the Stopwatch code, nothing importance.
 * 
 * @author thitiwat
 *
 */

public class Main {

	static final int ARRAY_SIZE = 500000;
	static double[] values = new double[ARRAY_SIZE];
	static Double[] values1 = new Double[ARRAY_SIZE];
	static final int counter = 1_000_000_000;
	static final BigDecimal[] values2 = new BigDecimal[ARRAY_SIZE];

	public static void main(String[] args) {
		preparingArray();

		Runnable[] t = { new Task1(50000), new Task1(100000), new Task2(100000), new Task3(counter, values),
				new Task4(counter, values1), new Task5(counter, values2) };
		
		for(int i = 0 ; i < t.length ; i++){
			measureAndPrint(t[i]);
		}
	}

	private static void measureAndPrint(Runnable t) {
		Stopwatch watch = new Stopwatch();
		System.out.println(t);
		watch.start();
		t.run();
		watch.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", watch.getElapsed());
	}

	private static void preparingArray() {
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;

		for (int i = 0; i < ARRAY_SIZE; i++)
			values1[i] = new Double(i + 1);

		for (int i = 0; i < ARRAY_SIZE; i++)
			values2[i] = new BigDecimal(i + 1);
	}
}
