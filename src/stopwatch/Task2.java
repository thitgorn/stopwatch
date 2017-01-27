package stopwatch;
/**
 * task 2: append chars to a StringBuilder.
 * @author Thitiwat Thongbor
 * @version 1.0
 *
 */
public class Task2 implements Runnable{
	/**Declare the attributes	 */
	private StringBuilder builder;
	private int count;
	private final char CHAR = 'a';
	
	public Task2(int count) { // this is constructor
		this.count = count;
		builder = new StringBuilder();
	}

	@Override
	public void run() {
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		System.out.println("final string length = " + builder.length());
	}
	
	public String toString(){
		return String.format("Append %,d chars to StringBuilder" , count);
	}
	
}
