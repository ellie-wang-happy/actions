package Assignment1.Action.section313;

/**
 * This class AllActionTest is for assignment1 Part 3 test
 * @author Lin Wang
 *
 */
public class AllActionTest {
	
	/**
	 * Instantiate the subclass, and retrieve the corresponding data from an array
	 * @param args not used
	 */
	public static void main(String[] args) {
		int actionCount = 5;
		Action[] action = new Action[actionCount];
		//instantiation 
		action[0] = new RegularAction("Wash your hands.");
		action[1] = new RegularAction("Wear a mask.");
		action[2] = new OccasionalAction("Take a PCR test.",20);
		action[3] = new OccasionalAction("Sanitize rooms.",10);
		action[4] = new RareAction("Get a boost shot.",12,15);
		
		System.out.println("PART 3");
		//prompt user to input a date
		User user = new User();
		user.inputDate();
		System.out.println("These are your actions on "+ user.date() +":");
		//list the corresponding data which matched the input date
		for (int i =0 ; i< actionCount; i++) {
			if (action[i].occursOn(user.getYear(), user.getMonth(), user.getDay())){
			 System.out.println(action[i]);	
			}
		}
		
        
	}
	
}
