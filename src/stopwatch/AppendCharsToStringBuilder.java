package stopwatch;

/**
 * task 2: append chars to a StringBuilder
 * 
 * @author Thitiwat Thongbor
 * @version 1.0
 *
 */
public class AppendCharsToStringBuilder implements Runnable {
	/** Declare the attributes */
	private StringBuilder builder;
	private int count;
	private final char CHAR = 'a';

	/**
	 * Initialze the task.
	 * 
	 * @param count
	 *            for how many char that want to add in string builder.
	 */
	public AppendCharsToStringBuilder(int count) {
		this.count = count;
		builder = new StringBuilder();
	}

	/**
	 * run the task.
	 */
	@Override
	public void run() {
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		System.out.println("final string length = " + builder.length());
	}

	/**
	 * return the task description
	 */
	public String toString() {
		return String.format("Append %,d chars to StringBuilder", count);
	}
}
