/*this program is find the factorial of a number*/
package factorial;
import java.util.Scanner;
public class Factorial {
	public static void fact(int a)//function to calculate factorial of entered number
	{    
		int fact=1;
		for(int i=1;i<=a;i++)
		{
           fact*=i; 
		}
		System.out.println("The Factorial of the number is " + fact + ".");
	}
	
	public static void main(String[] args) //main method
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = myObj.nextInt();//take a number from user
	    fact(a);
	    myObj.close();

    }
}
