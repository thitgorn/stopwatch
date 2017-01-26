package stopwatch;

/**
 * This is for testing the Stopwatch code, nothing importance.
 * 
 * @author thitiwat
 *
 */

public class Main {
	public static void main(String[] args) {
		 Stopwatch timer = new Stopwatch();
		 System.out.println("Starting task");
		 timer.start();
		 for(int i = 0 ; i < 100000 ; i++){
		 System.out.printf("elapsed = %.6f sec\n" , timer.getElapsed());
		 }
		 timer.stop();
		 System.out.printf("elapsed = %.6f sec\n" , timer.getElapsed());
	}
}
