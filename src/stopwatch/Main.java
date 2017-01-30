package stopwatch;

/**
 * This is for testing the Stopwatch code, nothing importance.
 * 
 * @author Thitiwat Thongbor
 * @version 1.0
 */

public class Main {

	final static int counter = 1_000_000_000;

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
