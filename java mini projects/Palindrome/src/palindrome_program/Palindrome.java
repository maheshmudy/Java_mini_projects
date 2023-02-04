/*this program is to check whether entered number is palindrome or not*/
package palindrome_program;
import java.util.Scanner;
public class Palindrome {

	public static void check_palindrome(int number) //function to check whether entered number is palindrome or not
	{
		int dummy=0;
		int coppy=number;
		while(number>0)
		{
			dummy=(dummy*10)+(number%10);
			number/=10;
		}
		if(dummy==coppy)
		{
			System.out.println("Entered number "+coppy+" is Palindrome");
		}
		else
		{
			System.out.println("Entered number is not Palindrome");
		}
		
	}
	

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter a number : ");//input number
		int number=myobj.nextInt();
		check_palindrome(number);
		myobj.close();
		
	}

}
