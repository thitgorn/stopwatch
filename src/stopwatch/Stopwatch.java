package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Thitiwat Thongbor
 * @version 1.0
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime;
	/** switch of stopwatch, true if start otherwise, it is false. */
	private boolean isRunning;

	/**
	 * construct the stopwatch that is not running.
	 */
	public Stopwatch() { // this is constructor
		isRunning = false;
	}

	/** Start the stopwatch if it is not already running. */
	public void start() {
		if (!isRunning) {
			startTime = System.nanoTime();
			this.isRunning = true;
		}
	}

	/** Stop the stopwatch if it is running. */
	public void stop() {
		if (isRunning) {
			stopTime = System.nanoTime();
			this.isRunning = false;
		}
	}

	/**
	 * The time between started clock and current time, if it's running. Between
	 * started timek and stoped timeer , if it isn't running.
	 * 
	 * @return the elapsed time in seconds with decimal.
	 */
	public double getElapsed() {
		if (isRunning) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		} else {
			return (stopTime - startTime) * NANOSECONDS;
		}
	}

	/**
	 * check is the stopwatch running or not.
	 * 
	 * @return ture if the stopwatch is runningm false if stopwatch is stopped.
	 */
	public Boolean isRunning() {
		return this.isRunning;
	}

}
