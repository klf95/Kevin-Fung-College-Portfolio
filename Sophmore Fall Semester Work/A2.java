
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
public class A2 {
    public static void main(String args[]) throws FileNotFoundException,IOException {
      double taxable,ltax=0;
      double stax,ptax,ftax,takehome;
	  int income,retire;
      String name;
      boolean city;
      File text = new File("a2input.txt");
      try {
      if (text.createNewFile()){
        System.out.println("File created: " + text.getName());
      } else {
        System.out.println("file already exists");
      }
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }
        //Creating Scanner instance to read File in Java
        Scanner scnr = new Scanner(text);

        //Reading each line of the file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNextLine()){
            name = scnr.next();
            income = scnr.nextInt();
            retire = scnr.nextInt();
            city = scnr.nextBoolean();
            taxable = income - retire;
            System.out.println("taxpayer name: " + name);
            System.out.println("your taxable is: " + taxable);
            if (city){
              ltax = taxable * .02;
              System.out.println("the local tax you pay is: " + ltax);


            }
            if (!city){
              ltax = taxable * .01;
              System.out.println("the local tax you pay is: " + ltax);

            }
            ptax = taxable * .062;
            stax = taxable * .0307;
            System.out.println("the payroll tax you pay is: " + ptax);
            System.out.println("the state tax tax you pay is: " + stax);



            if (taxable <= 8500) {
              ftax = taxable * 0;
              System.out.println("your federal tax is: " + ftax);

            }
            if (taxable <= 12000){
              ftax = taxable * .1;
              System.out.println("your federal tax is: " + ftax);

            }
            if (taxable <= 20000){
              ftax = taxable * .15;
              System.out.println("your federal tax is: " + ftax);

            }
            if (taxable <= 50000){
              ftax = taxable * .20;
              System.out.println("your federal tax is: " + ftax);

            }
            if (taxable > 50000){
              ftax = taxable * .25;
              System.out.println("your federal tax is: " + ftax);
              takehome = taxable - (ltax + ptax + stax + ftax);
              System.out.println("takehome is: " + takehome);
            }







            lineNumber++;
          }


	  // make scanner to read input file
	  //make filewriter for output file

	  //////////Begin loop
	  //use scanner to set values for income,retire,name,city
	  // calc taxable as income - retire

	  // city residents pay 2% of their txable income to local taxable otherwise its 1% for non city

	  // payroll tax is a flat 6.2% of taxable
	  // state tax is a flat 3.07% of taxable

	  /* Federal tax brackets
	  taxable is:
	  0-8500 0%
	  less than or eqaul to 12000 10%
	  less than or eqaul to 20000 15%
	  less than or equal to 50000 20%
	  over that amount is 25%
	  ** this should be an inclusive test block of ascending or descending tests OR two sided AND
	  */
	  //Output phase. You MAY output to terminal in addition to the FILE but the FILE output is required!
	  //Output each on their own line with labeling of each value. See a2output.png



      //////////end loop
	  // close your output file

  }//maincatch
}//class
