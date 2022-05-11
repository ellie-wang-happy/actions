package Assignment1.Action.section313;
/**
*In this file you will provide the code solution for Part 2. 
*You are required to create a subclass named RareAction.
*Activities for RareAction occurs on a particular date of the year specified.
*@author  Lin Wang
*@version 1.1
 */

//YOUR CODE STARTS HERE!!!
public class RareAction extends Action {
	private int month;
	private int day;
	/**
	 *  Construction with an action description
	 * @param str action description 
	 */
	public RareAction(String str) {
		super(str);
	}

	/**Construction with 4 parameters
	 * 
	 * @param str : action description
	 * @param month:acction occurs month
	 * @param day: action occurs day
	 */
	public RareAction(String str,int month,int day) {
		this(str);
		this.month = month;
		this.day= day;

	}

	/**
	 * @param year: action occurs year
	 * @return true:actions occurred on the certain day in a year
	 *         false: no action happened on the certain day in a year
	 */

	@Override
	public boolean occursOn(int year, int month, int day) {
		
		return(this.month ==month && this.day == day);
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
