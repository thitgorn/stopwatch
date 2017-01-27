package stopwatch;

/**
 * task 4: add Double objects from an array.
 * 
 * @author Thitiwat Thongbor
 * @version 1.0
 */
public class Task4 implements Runnable {

	private Double[] values;
	private int counter;

	public Task4(int counter, Double[] values) {
		this.counter = counter;
		this.values = values;
	}

	@Override
	public void run() {
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);

	}
	
	public String toString(){
		return String.format("Sum array of Double objects with count=%,d\n", counter);
	}

}
