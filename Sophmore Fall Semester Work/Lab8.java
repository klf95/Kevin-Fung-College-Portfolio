import java.util.*;
import java.io.*;
public class Lab8 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number to factor:");
   int factorialvalue = 1;
   int n = sc.nextInt();
   int start = n;
  System.out.print("Final Value of " + start+" !factorial is "+factorial(n,factorialvalue));
  }
static int factorial(int n,int factorialvalue){ // this is the required recursive function
  if(n == 0){ 
    return factorialvalue;
  }
  factorialvalue *= n;
  System.out.println("current n value is : " + n);
  return factorial(n-1, factorialvalue);
}
}
