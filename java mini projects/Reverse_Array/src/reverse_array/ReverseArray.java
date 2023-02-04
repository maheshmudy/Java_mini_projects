/*this program is to reverse the element of an integer one dimensional array*/
package reverse_array;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		int n;  
		Scanner myobj=new Scanner(System.in);  
		System.out.print("Enter the number of elements of your  integer-array : ");//read length of array
		n=myobj.nextInt();   
		int[] array = new int[n];  
		System.out.println("Enter the elements of the integer-array: ");  
		for(int i=0; i<n; i++)  
		{  
		System.out.println("Enter Array["+i+"]  :");  
		array[i]=myobj.nextInt();  //reading the array elements
		}  
		System.out.println("The reversed order of array elements is ");
		for(int i=n-1; i>=0; i--)  
		{ 
			System.out.print(array[i]+" ");//display reverse order
		}
        myobj.close();
	}

}
