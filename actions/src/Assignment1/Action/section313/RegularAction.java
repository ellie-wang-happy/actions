package Assignment1.Action.section313;
/**
 * This is code for Part 1.
 * The RegularAction inherits from superclass Action, and this class record a regular activity occurs every day
 * @version 1.0
 * @author Lin Wang
 */

//YOUR CODE STARTS HERE!!!!
public class RegularAction extends Action {

	/**
	 *  Construction without argument
	 *  
	 */
	public RegularAction() {
		super();
	}
	/**
	 *  Construction with an action description
	 * @param str action description 
	 */
	public RegularAction(String str) {
		super.setDescription(str);;
	}
	

	/**
	 * @param year: action occurs year
	 * @param month:acction occurs month
	 * @param day: action occurs day
	 * @return true:actions occurred on the specific date
	 *         false: no action happened on the specific date
	 */
	@Override
	public boolean occursOn(int year, int month, int day) {
	
		return(year!=0 && month !=0 && day != 0);
	}

	
	/**
    * Converts action activity to string description.
    * @return action description
	 */
	@Override
	public String toString() {
		return super.toString();
	}


}
