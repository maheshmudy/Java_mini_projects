/*this program to display star pattern like diamond*/
package halfDiamond;
import java.util.Scanner;
public class HalfDiamond {
	
	
	public static void make_half_diamond(int n)//function to print diamond star pattern
	{   
	    int nn=(2*n)-1;
		for(int i=1;i<=nn;i++)
		{
			if(i<n+1)
			{
				for(int j=1;j<=i;j++)
			
		         {
			       System.out.print("*");
		         }
			}
			else if(i>=n+1)
			{
				for(int z=nn-i;z>=0;z--)
				{
					 System.out.print("*");
				}
			}
				
		    System.out.println("");
		
		}
		
		
		
	}
	
	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter a number: "); //take a number from uses
		int number = myObj.nextInt();
	    make_half_diamond(number);
	    myObj.close();

    }

}
