/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int prevNum = -1;
		int currNum = (int) (Math.random() * 10);
		do {
			prevNum = currNum;
			currNum = (int) (Math.random() * 10);
			System.out.print(prevNum + " ");
			
		} while (prevNum <= currNum);
	}
}
