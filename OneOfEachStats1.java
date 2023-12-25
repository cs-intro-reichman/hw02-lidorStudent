/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int numOfExperiments = Integer.parseInt(args[0]);
		int twoChildren = 0;
		int threeChildren = 0;
		int fourOrMoreChildren = 0;
		double countAllChildren = 0;
		for (int i = 0; i < numOfExperiments; i++) {
			int numOfChildren = 0;
			double randomGender = 0;
			boolean haveBoy = false;
			boolean haveGirl = false;
			while (!(haveBoy && haveGirl)) {
				randomGender = Math.random();
				if (randomGender < 0.5) {
					haveBoy = true;
					++numOfChildren;
				} else {
					haveGirl = true;
					++numOfChildren;
				}
			}
			if (numOfChildren == 2) {
				++twoChildren;
			} else if (numOfChildren == 3) {
				++threeChildren;
			} else {
				++fourOrMoreChildren;
			}
			countAllChildren += numOfChildren;
		}
		System.out.println("Average: " + (countAllChildren / numOfExperiments) +
						   " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
		System.out.print("The most common number of children is ");
		if (Math.max(Math.max(twoChildren, threeChildren), fourOrMoreChildren) == twoChildren) {
			System.out.println("2.");
		} else if (Math.max(Math.max(twoChildren, threeChildren), fourOrMoreChildren) == threeChildren) {
			System.out.println("3.");
		} else {
			System.out.println("4 or more.");
		}
	}
}