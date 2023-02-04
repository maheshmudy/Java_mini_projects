/*this program is to print elements of an array*/
package array_loop_miniproject;
public class ArrayLoop {	
	public static void main(String[] args) {
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};//array
		System.out.println("The elements of array are :");
		for(String day : days)//iteration of array
		{
			System.out.println(day+" ");
		}
		
		
	}

}
