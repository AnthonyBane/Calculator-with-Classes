
public class Calculator {

	//Instantiate classes
	static Addition Add = new Addition();
	static GetUserInput UserInput = new GetUserInput();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		double number1;
		double number2;
		double result;
		
		System.out.println("Calculator initiatised.\n");
		//Get user input
		number1 = UserInput.GetInput();
		number2 = UserInput.GetInput();
		
		System.out.print("Result: ");
		result = setResult(number1, number2);
		System.out.print(result);
		
	}
	
	private static double setResult (double number1, double number2){
		double result;
		result = Add.Add(number1, number2);
		return result;
	}
}
