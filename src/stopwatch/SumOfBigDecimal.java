package stopwatch;

import java.math.BigDecimal;

/**
 * task 5: add BigDecimal objects from an array. 
 * You need a large counter value to get a measurable time.
 * 
 * @author Thitiwat Thongbor
 * @version 1.0
 * 
 */
public class SumOfBigDecimal implements Runnable {

	private int counter;
	static final int ARRAY_SIZE = 500000;

	/**
	 * Initialze the Object
	 * @param counter is how many times adding to BigDecimal Object.
	 */
	public SumOfBigDecimal(int counter) {
		this.counter = counter;
	}

	/**
	 * run the task.
	 */
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);

		BigDecimal sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
		System.out.println("sum = " + sum);
	}

	/**
	 * return the task description.
	 */
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\n", counter);
	}
}
