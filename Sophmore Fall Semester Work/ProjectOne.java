import java.util.Scanner;

public class ProjectOne
{

    public static void main(String[] args)
    {
      int a;
      int b;
      String operation;
      Scanner kbd = new Scanner(System.in);
      System.out.println("please enter the first number");
        a = kbd.nextInt();

        System.out.println("please enter the second number");
        b = kbd.nextInt();
        System.out.println("please enter the symbol of operation");
        operation = kbd.next();
        if (operation.equals("/")){
          if (b == 0 || a == 0){
            System.out.println("can't divide by 0");
            System.exit(0);
          }
        }
        if (operation.equals("+")){

          System.out.println("your answer is: " + (a + b));
        }
        if (operation.equals("-")){

          System.out.println("your answer is: " + (a - b));
        }
        if (operation.equals("*")){

          System.out.println("your answer is: " + (a * b));
        }
        if (operation.equals("/")){

          System.out.println("your answer is: " + (a / b));
        }


    }
}
