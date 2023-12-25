/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 1;
		String yesPerfectNumMessage = num + " is a perfect number since " + num + " = 1";
		String notPerfectNumMessage = num + " is not a perfect number";
		for (int i = 2; i < num; i++) {
			if ((num % i) == 0) {
				sum += i;
				yesPerfectNumMessage += " + " + i;
			}
		}
		if (num == sum) {
			System.out.println(yesPerfectNumMessage);
		} else {
			System.out.println(notPerfectNumMessage);
		}
	}
}
