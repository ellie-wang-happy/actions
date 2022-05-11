package Assignment1.Action.section313;
/**
 * This class ActionDrive is for assignment1 Part 1 test
 * @author Lin Wang
 *
 */

public class ActionDriver {
	/**
	 *  instantiate the RegularAction Class and use class reflection to do some test for it
	 * @param args not used
	 */
	public static void main(String[] args) {

		System.out.println("PART 1");
	
		System.out.println("RegularAction is just a subclas of Action: "
		+ (RegularAction.class.getSuperclass() ==Action.class));		
		System.out.println("Expected:"+true);

		int length = RegularAction.class.getDeclaredFields().length;
		if (length == 0) {
			System.out.println("RegularAction activities have no extra fields:  true");	
		}else {
			System.out.println("RegularAction activities have no extra fields: false");

		}
		System.out.println("Expected: true");

		//test a regular action
		String str = "Wash your hands";
		RegularAction regular = new RegularAction(str);
		System.out.println("Looking at regular actions:" + regular);
		System.out.println("Expected:" +str);
		System.out.println(regular.occursOn(2022, 2, 24));
		System.out.println("Expected: true");
	}

}
