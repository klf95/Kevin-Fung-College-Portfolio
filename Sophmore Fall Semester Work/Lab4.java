import java.util.Scanner;
public class Lab4 {
    public static void main(String args[]) {
      int a,b,div;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Input 2 numbers on the same line to determine their Greatest Common Denominator");
	  // pull in the values for a and b
      
      // perform an if test to determine if a is less than b, Why? We need a shared divisor for these 2 numbers
	  // we should start at the lower of the 2 numbers since any number larger than the lowest number cant possibly be a shared divisor
	  // if a is less than b then set div to a, else set div to b. i.e think if else test
      
      
	  //a number is a divisor of another if the number % by the divisor == 0. i.e 14%2== 0 since 14/2 = 7 with no remainder which is what modulus seeks
	  // if for example you entered 21 14  then 7 should end up being the GCD 
	  // we need a loop here to begin at the initial set value for div, and decrement until a GCD is found, at that point terminate the loop
	  
	  //CAREFUL! the loop needs a TRUE test result to keep going, but we need the test conditions to be FALSE so a not ! will be needed
	  // both a and b need to be modded by div and equal 0 at the same time. i.e. && test
	  
	  // hint for while loop
	  // while (not( a mod div == 0 && b mod div == 0))
		  // while loop body will simply decrement div by 1 - doesnt need to do anything else.
	  // the loop will continue for as long as the GCD is not found, when it stops on a shared number, you have locked onto the GCD
      
      System.out.println("GCD of those numbers = " + div);
    }
}