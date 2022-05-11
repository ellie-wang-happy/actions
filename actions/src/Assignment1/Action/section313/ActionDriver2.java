package Assignment1.Action.section313;
/**
 * This class ActionDrive2 is for assignment1 Part 2 test
 * @author Lin Wang
 *
 */
public class ActionDriver2 {
	/**
	 *  Check the type of OccasionalAction Class and RareAction and use class reflection to do some test for them
	 * @param args not used
	 */
	public static void main(String[] args) {
		System.out.println("PART 2");

		System.out.println("OccasionalAction is just a subclas of Action: "
				+(OccasionalAction.class.getSuperclass() == Action.class) );

		System.out.println("Expected: true");


		System.out.println("RareAction is just a subclas of Action: "
				+ (RareAction.class.getSuperclass() == Action.class));
		System.out.println("Expected: true");

		 //test for occasionalaction and rareaction
		int length = OccasionalAction.class.getDeclaredFields().length;
		if( length == 1) {
			System.out.println("OccasionalAction activities have extra fields: true");
		}else {
			System.out.println("OccasionalAction activities have extra fields: false");
		}
		System.out.println("Expected: true");
		
		length = RareAction.class.getDeclaredFields().length;
		if(length == 2 ) {
		System.out.println("RareAction activities have  extra fields: true ");
		}else {
		System.out.println("RareAction activities have  extra fields: false ");
		}
		System.out.println("Expected: true");
		
	}


}
