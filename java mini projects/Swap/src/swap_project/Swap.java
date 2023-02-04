/*this program is to swap first digit of a number by last element*/
package swap_project;
import java.util.Scanner;
public class Swap {
	public static void do_swap(int number)
	{   
		char dummy1,dummy3;
		String dummy2;//dummy variable to interchange values of first and last element of a number
		String number_in_string=Integer.toString(number);
		int length=number_in_string.length();
		dummy1=number_in_string.charAt(0);
		dummy2=number_in_string.substring(1,length-1);
		dummy3=number_in_string.charAt(length-1);
		//values exchange process
		String new_string=dummy3+dummy2+dummy1;
		int new_value=Integer.parseInt(new_string);
		System.out.println("result is :"+new_value);//print resultant number
	}

	public static void main(String[] args) {
		System.out.println("This program is to swap first and last digits of a number");
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter a number : ");//reading input
		int number=myobj.nextInt();
		do_swap(number);
		myobj.close();
		
	}

}
