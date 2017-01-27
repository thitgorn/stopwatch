package stopwatch;
/**
 * task 1: append chars to a string.
 * @author Thitiwat Thongbor
 * @version 1.0
 *
 */
public class Task1 implements Runnable {
	/**Declare the attributes */
	private final char CHAR = 'a';
	private int count;
	private String result = "";
	
	/**
	 * construct the task.
	 * @param count is the number of CHAR adding to String.
	 */
	public Task1(int count) {
		this.count = count;
	}
	
	/**
	 * run the task.
	 */
	@Override
	public void run() {
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}
	
	@Override
	public String toString(){
		return String.format("Append %,d chars to String", count);
	}

}
