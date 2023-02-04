/*this program is to find the roots of a quadratic equation*/
package quadraticEquation;
import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) {//main method
		double r1,r2,r;
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter the 3 coefficients of quadratic equation ax ² + bx + c = 0 ");
		//enter value of a,b & c
		System.out.println("Enter the value of a :");
		int a=myobj.nextInt();
		System.out.println("Enter the value of b :");
		int b=myobj.nextInt();
		System.out.println("Enter the the value of c :");
		int c=myobj.nextInt();
		int d=(b*b)-(4*a*c);//discriminant
		double det=Math.sqrt(d);
		if(d>0)
		{
			r1=(-b-det)/(2*a);
			r2=(-b+det)/(2*a);
			System.out.println("The roots are real and distnct");
			System.out.println("root-1 = "+r1+"\n"+"root-2 = "+r2);
		}
		else if(d==0)
		{
			r=(-b)/(2*a);
			System.out.println("The roots are real and equal");
			System.out.println("root-1 = "+r+"\n"+"root-2 = "+r);
		}
		else if(d<0)
		{
			r=(-b)/(2*a);
			r1=det/(2*a);
			System.out.println("The roots are imaginary");
			System.out.println("root-1 = "+r+" + i"+r1+"\n"+"root-2 = "+r+" - i"+r1);
		}
		
		myobj.close();
	}

}
