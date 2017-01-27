package stopwatch;

import java.math.BigDecimal;

/**
 * task 5: add BigDecimal objects from an array.
 * @author Thitiwat Thongbor
 *
 */
public class Task5 implements Runnable {
	private int counter;
	private BigDecimal[] values;

	public Task5(int counter, BigDecimal[] values) {
		this.counter = counter;
		this.values = values;
	}

	@Override
	public void run() {
		BigDecimal sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
		System.out.println("sum = " + sum);
	}

	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\n", counter);
	}
}
