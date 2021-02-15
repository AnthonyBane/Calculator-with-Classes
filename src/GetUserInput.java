import java.util.Scanner;

public class GetUserInput {
	public double GetInput(){
		
		double number = 0;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number: ");
		number = reader.nextDouble();
		
		System.out.println(number);
//		reader.close();
		
		return number;	
	}
}
