/*this program is to enter a number and print this number in words*/
package Number_In_Words;
import java.util.Scanner;
public class Number_In_Words {
	
	public static int reverse(int number)
	{
		int rev=0;
		while(number>0)
		{
			rev=(rev*10)+(number%10);
			number/=10;
		}
		return rev;
	}
	
	public static void  converter(int number)   //function definition
	{    
		int dummy;
		while(number>0)
		{
			dummy=number%10;
			number/=10;
			switch(dummy)
			{
			case 0:System.out.print("ZERO ");break;
			case 1:System.out.print("ONE ");break;
			case 2:System.out.print("TWO ");break;
			case 3:System.out.print("THREE ");break;
			case 4:System.out.print("FOUR ");break;
			case 5:System.out.print("FIVE ");break;
			case 6:System.out.print("SIX ");break;
			case 7:System.out.print("SEVEN ");break;
			case 8:System.out.print("EIGHT ");break;
			case 9:System.out.print("NINE ");break;
			default :System.out.print("wrong number");break;
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int number = myObj.nextInt();  //take input-number
	    converter(reverse(number));  //passing input-number to function which convert number into words
	    myObj.close();

    }

}
