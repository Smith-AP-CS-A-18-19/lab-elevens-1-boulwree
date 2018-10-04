/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c = new Card("ace" , "club", 1);
		Card s = new Card ("7", "heart" , 7);
		Card x = new Card ("7", "heart", 7);
		System.out.println(x.matches(s));
		System.out.println(c.matches(x));
		System.out.println(c.toString());
	}
}
