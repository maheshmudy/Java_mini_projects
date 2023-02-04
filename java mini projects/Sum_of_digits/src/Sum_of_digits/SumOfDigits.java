/*this program is to find the sum of digits of a number*/
package Sum_of_digits;
import java.util.Scanner;
public class SumOfDigits {
	
	public static void find_sum(int number)
	{
		int sum=0;
		int copy=number;//copy of entered number b
		while(number>0)
		{
			sum=sum+number%10;//sum calculation
			number/=10;
		}
		System.out.println("Sum of digits in the entered number "+copy+" is : "+sum);
	}
	

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=myobj.nextInt();//reading input number
		find_sum(number);
		myobj.close();
		
	}

}
