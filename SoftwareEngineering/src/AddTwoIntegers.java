import java.util.Scanner;

public class AddTwoIntegers {

public static void main(String[] args) 
{
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        String plus = "+";
        String minus = "-";
        String divide = "/";
        String multiply = "*";
        String function;
        
        String response;
        
        System.out.println("welcome to the number calculator");
        
        for(int I = 0; I != 1;)
        {
        
        System.out.println("Please enter first number: ");
        first = scan.nextInt();
        System.out.println("Please enter second number: ");
        second = scan.nextInt();
        System.out.println("Now enter a function + for plus, - for minus, / for divide and * for multiply");
        function = scan.next();
        
        if(function.equals("+"))
        {
        	int sum = first + second;

            System.out.println("The sum is: " + sum);
        }
        else if(function.equals("-"))
        {
        	int sum = first - second;

            System.out.println("The sum is: " + sum);
        	
        }
        else if(function.equals("/"))
        {
        	int sum = first / second;

            System.out.println("The sum is: " + sum);
        	
        }
        else if(function.equals("*"))
        {
        	int sum = first * second;

            System.out.println("The sum is: " + sum);
        	
        }
        else
        {
        	System.out.println("Invalid input, restart and try again.");
        }
        
        System.out.println("would you like to go again? (Y/N): ");
        response = scan.next();
        
        if(response.equals("n")|| response.equals("N"))
        {
        	I = 1;
        	System.out.println("goodbye");
        }
        }

    }
}
