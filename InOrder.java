/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int randomNum1 = (int) (Math.random() * 10);
		int randomNum2 = (int) (Math.random() * 10);
		System.out.print(randomNum1);
		do {
			
		} while (randomNum1 <= randomNum2);
	}
}
