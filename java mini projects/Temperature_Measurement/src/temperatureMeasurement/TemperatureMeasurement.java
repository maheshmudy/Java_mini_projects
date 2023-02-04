/*this program is to convert temperature in fahrenheit in celsius*/
package temperatureMeasurement;
import java.util.Scanner;
public class TemperatureMeasurement {
	
	public static void celsius(double temp)
	{
		double celsius_temperature=(temp-32)*5/9;
		
		System.out.println("temperature in celcius is :"+celsius_temperature);//print temperature in celsius
	}
	
	
	
	
	public static void main(String[] args) //main method
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter temperature in fahrenheit: ");
		double temp = myObj.nextDouble();//input temperature in fahrenheit
	    celsius(temp);
	    myObj.close();

    }

}
