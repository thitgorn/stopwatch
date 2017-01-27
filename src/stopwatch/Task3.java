package stopwatch;

/**
 * task 3: add double primitives from an array.
 * 
 * @author Thitiwat Thongbor
 * @version 1.0
 *
 */
public class Task3 implements Runnable {

	private int counter;
	private double[] values;

	public Task3(int counter, double[] values) {
		this.counter = counter;
		this.values = values;
	}

	@Override
	public void run() {
		double sum = 0.0;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}

	public String toString() {
		return String.format("Sum array of double primitives with count=%,d\n", counter);
	}

}
