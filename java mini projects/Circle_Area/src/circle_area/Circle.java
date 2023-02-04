/*this program to find area of a circle using it's diameter*/
package circle_area;
import java.util.Scanner;
//class
public class Circle {
	public static void area_circle(double diameter)//function to print area of circle
	{    
		
		double pi=3.14;
		System.out.println();
		double A = (pi*diameter*diameter)/4;
		
		System.out.println("The area of circle is " + A + ".");
		
	}
	
	public static void main(String[] args) //main method
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Input the diameter of circle: ");
		double diameter = myObj.nextDouble();//input of diameter
	    area_circle(diameter);
	    myObj.close();

    }
	
	
}