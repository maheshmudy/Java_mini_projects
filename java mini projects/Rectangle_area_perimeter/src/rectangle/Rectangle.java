/*this program is to find the area and perimeter of a rectangle*/
package rectangle;
import java.util.Scanner;  // Import the Scanner class
public class Rectangle {

	public static void area_perimeter_rectangle(int length, int width)//function to print area and perimeter of rectangle
	{
		System.out.println();
		int A = length * width;
		int P =2*(length+width);
		System.out.println("The area of rectangle is " + A + ".");//print area
		System.out.println("The perimeter of rectangle is " + P + ".");//print perimeter
		
	}
	
	public static void main(String[] args) //main method
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Input the length of rectangle: ");
	    int length = myObj.nextInt();//input of length
		System.out.print("Input the width of rectangle: ");
	    int width = myObj.nextInt();//input of width
	    area_perimeter_rectangle(length, width);
	    myObj.close();

    }

}
