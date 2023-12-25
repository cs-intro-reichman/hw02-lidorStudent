/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int numOfChildren = 0;
		double randomGender = 0;
		boolean haveBoy = false;
		boolean haveGirl = false;
		while (!(haveBoy && haveGirl)) {
			randomGender = Math.random();
			if (randomGender < 0.5) {
				haveBoy = true;
				++numOfChildren;
				System.out.print("b ");
			} else {
				haveGirl = true;
				++numOfChildren;
				System.out.print("g ");
			}
		}
		System.out.println();
		System.out.println("You made it... and you now have " + numOfChildren + " children.");
	}
}
