package Assignment1.Action.section313;

import java.util.Scanner;

/**
 * 
 * This class provides utility for getting user input a date  from the console using
 * an instance of Scanner set to new Scanner(System.in)
 * @author Administrator
 */
 

public class User {
	private int year;
	private int month;
	private int day;
/**
 * inputeDate is used to prompt user to input a date, and convert the date from string to int
 */
	public void inputDate () {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a date (like 2010 01 30)");
		String src = input.nextLine();
		String str[] = src.split(" ");
		this.year = Integer.parseInt(str[0]);
		this.month = Integer.parseInt(str[1]);
		this.day = Integer.parseInt(str[2]);
	}
 /**
  *  getter method getYear()
  * @return year return the int type year
  */
	public int getYear() {
		if(year > 0) {
			return year;
		}else
			return 0;
	}
	/**
	  *  getter method getMonth()
	  * @return year return the int type month
	  */
	public int getMonth() {
		if( month>0 && month <=12) {
			return month;
		}
		else return 0;
		
	}
	/**
	  *  getter method getDay()
	  * @return year return the int type day
	  */
	public int getDay() {
		if(day >=1 && day <= 31) {
			return day;
		}else
			return 0;

	}

/**
 * output date string with month/day/year
 * @return string date
 */
	public String date() {
		return ""+month +"/" +day+"/"+year;
	}



}
