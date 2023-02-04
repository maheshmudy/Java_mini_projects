/*this program to print the power of 'a' raised to 'b'*/
package exponent;
import java.util.Scanner;
public class Exponent {
	
	
	public static void exponential(int a,int b)  //function  print the power of 'a' raised to 'b'
	{
		if(a>0 && b>0)
		{
		int result=1;
		for(int i=1;i<=b;i++)
		{
			result=result*a;
		}
		
		System.out.println("Result is :" + result);	
		}
		else
		{
			System.out.println("restricted inputs ");
		}
	
	}
	

	public static void main(String[] args) {
		Scanner inputs =new Scanner(System.in);
		System.out.println("program to find value of a^b");
		System.out.println("Insert the value of a : ");
		int a=inputs.nextInt(); //input the value of 'a'
		System.out.println("Insert the value of b : ");
		int b=inputs.nextInt(); //input the value of 'b'
		exponential(a,b); //function passing
		inputs.close();

	}

}
