/*this program is to take array,display array,search element of array and sort thr array elements*/

package menu_for_array;
import java.util.Scanner;
public class MenuForArray {
	
	public static void accept(int[] array)    //function to input array
	{   
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter the elements of integer-array : ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=myobj.nextInt();
		}
		
	}
	public static void display(int[] array)    //function to display array
	{
		System.out.println("Elements of array are : ");
		for(int j=0;j<array.length;j++)
		{
			System.out.print(array[j]+" ");
		}
		System.out.println();
	}
	public static void search(int[] array)    //function to search array element
	{   Scanner myobj=new Scanner(System.in);
	int f=0,i;
		System.out.println("Enter the searching element :");
		int search_element=myobj.nextInt();
		for(i=0;i<array.length;i++)
		{
			if(array[i]==search_element)
			{
				f=1;
				
				break;
			}	
		}
		if(f==1)
		{
			System.out.println("The searching element found at index :"+i+"\n");
		}
		else
		{
			System.out.println("The searching element not found.");
		}
		
	}
	public static void sort(int[] array)     //function to sort the array element in ascending order
	{
		 for (int i = 0; i <array.length-1; i++)
	     for (int j = 0; j < array.length-i-1; j++)
	        if (array[j] > array[j+1])
	          {
	            int temp = array[j];
	            array[j] = array[j+1];
	            array[j+1] = temp;
	           }
		System.out.println("Sorting proccess complected.");
	}
	static int[] array;
	
	public static void main(String[] args) {
		    Scanner myobj=new Scanner(System.in);
		   
		    while(true) {
			System.out.println("1.Accept array");   //input options
			System.out.println("2.Display array");
			System.out.println("3.Search the element within array");
			System.out.println("4.Sort the array");
			System.out.println("enter your option");
			
			int option=myobj.nextInt();
			 
		   if(option==1)
		   {
			    System.out.println("enter number of elements in array");
				int length_of_array=myobj.nextInt();     //take array length from user
				array=new int[length_of_array];
			    accept(array);
		   }
		   else if(option==2)
		   {
			   display(array);
		   }
		   else if(option==3)
		   {
			   search(array);
		   }
		   else if(option==4)
		   {
			   sort(array);
		   }
		
		   else break;
		   
		   }
		
		   }
		
}

