package stopwatch;

/**
 * Measure the time between the task and print it out.
 * 
 * @author Thitiwat Thongbor
 * @version 1.0
 *
 */
public class TaskTimer {
	private static Stopwatch watch;

	/**
	 * Initialize the TaskTimer.
	 */
	public TaskTimer() {
		watch = new Stopwatch();
	}

	/**
	 * Start the timer at the same time of running the task. Print how long of
	 * doing the task.
	 * 
	 * @param runnable
	 *            is the task.
	 */
	public void measureAndPrint(Runnable runnable) {
		System.out.print(runnable.toString());
		watch.start();
		runnable.run();
		watch.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", watch.getElapsed());
	}
}
