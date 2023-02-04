/*this program is to find the product of digits in a number*/
package Productofdigits;
import java.util.Scanner;
public class ProductOfDigits {
	public static void find_product(int number)//function to find the product of digits in a number
	{
		int product=1;
		int coppy=number;
		while(number>0)
		{
			product=product*(number%10);
			number/=10;
		}
		System.out.println("Product of digits in the entered number "+coppy+" is : "+product);
	}
	

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=myobj.nextInt();// take a input number
		find_product(number);
		myobj.close();
		
	}

}
