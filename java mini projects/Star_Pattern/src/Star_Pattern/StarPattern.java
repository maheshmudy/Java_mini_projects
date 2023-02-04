/*this program is to print rectangular star pattern*/
package Star_Pattern;
import java.util.Scanner;

public class StarPattern {//class
	
	public static void make_pattern(int n)//function to print star pattern
	{   
		for(int i=n;i>=1;i--)
		{
			
				for(int j=1;j<=i;j++)
			
		         {
			       System.out.print("*");
		         }
			System.out.println("");
			}
					
		}
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = myObj.nextInt();//reading a number
	    make_pattern(number);
	    myObj.close();

	}

}
