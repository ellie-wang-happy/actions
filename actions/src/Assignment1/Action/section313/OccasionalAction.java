package Assignment1.Action.section313;

/**
*In this file you will provide the code solution for Part 2. 
*You are required to create a subclass named OccasionalAction.
*These are activities that occur on the same day of every month specified.
*@version 1.1
*@author Lin Wang
*/

//YOUR CODE STARTS HERE!!!
public class OccasionalAction extends Action {
	
	private int day;
	/**
	 *  Construction without argument
	 * 
	 */
	public OccasionalAction() {
		super();
	}
	/**
	 *  Construction with an action description
	 * @param str action description 
	 */
	public OccasionalAction(String str) {
		super.setDescription(str);
	}
	
	/**Construction with 4 parameters
	 * 
	 * @param str : action description
	 * @param day: action occurs day
	 */
	public OccasionalAction(String str, int day) {
		this(str);
		this.day = day;
	}
	
	/**
	 * @param year: action occurs year
	 * @return true:actions occurred on the specific day of each month
	 *         false: no action happened on the specific day of each month
	 */
	@Override
	public boolean occursOn(int year, int month, int day) {

		return (this.day == day && day != 0);
	}

}
