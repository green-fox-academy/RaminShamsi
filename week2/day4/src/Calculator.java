import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Calculator {
  public static void main(String... args) {

    String inputString = userInput();
    //char [] characters = inputString.toCharArray();
    String operation = inputString.substring(0,1);

    int space1 = inputString.indexOf(" ");
    int space2 = inputString.lastIndexOf(" ");
    int operand1 = Integer.parseInt(inputString.substring(2,space2));
    int operand2 = Integer.parseInt(inputString.substring(space2+1));
    if (operation.equals("/") ) {
      System.out.println(operand1/operand2);
    }
            // String dummy = characters.toString();
  //  for (int i = 0; i <characters.length ; i++) {
   //   if (  2 == 0) {
    //    String dummy = Arrays.asList(characters[i]).toString();

       // System.out.print(String.copyValueOf(characters));
      //  Integer nums = Integer.parseInt(dummy);
      //  System.out.println(nums);
    //  }
    //  }
   // System.out.println(Integer.parseInt(String.copyValueOf(characters)));
   // Integer nums = Integer.parseInt(dummy);
    ArrayList<String> nums = new ArrayList<>();
    //nums.add(characters[0]);


    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations:
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
  }

  public static String userInput(){
    System.out.println("Please type in the expression in following format (+ 3 3):");
    Scanner scanner = new Scanner(System.in);
    String newInput = scanner.nextLine();
    return newInput;
  }
}
