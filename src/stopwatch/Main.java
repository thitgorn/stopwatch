package stopwatch;

/**
 * Testing the speed of separate parts in TaskTimer class.
 * 
 * @author Thitiwat Thongbor
 * @version 1.0
 */
public class Main {

	/**The constant of number that testing in sum	 */
	final static int counter = 1_000_000_000;

	/**
	 * this is main class.
	 */
	public static void main(String[] args) {
		Runnable[] tasks = { new AppendCharsToString(50000), new AppendCharsToString(100000),
				new AppendCharsToStringBuilder(100000), new SumOfdouble(counter), new SumOfDoubleObject(counter),
				new SumOfBigDecimal(counter) };
		TaskTimer tasktimer = new TaskTimer();
		for (Runnable task : tasks) {
			tasktimer.measureAndPrint(task);
		}
	}

}
