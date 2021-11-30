import java.util.Scanner;
public class Lab3 {
  public static void main (String[]args){
    double test1;
    double test2;
    double test3;
    double average;
    String grade;
    grade = "F";
    Scanner keyboard = new Scanner (System.in);
    System.out.println("enter test score #1: ");
    test1 = keyboard.nextDouble();
    System.out.println("enter test score #2: ");
    test2 = keyboard.nextDouble();
    System.out.println("enter test score #3: ");
    test3 = keyboard.nextDouble();
    average = (test1 + test2 + test3) / 3;
    System.out.println(average);
    if (average >= 97){
      grade = "A+";
    }
    else if (average >= 93){
      grade = "A";
    }
    else if (average >= 90){
      grade = "A-";
    }
    else if (average >= 87){
      grade = "B+";
    }
    else if (average >= 83){
      grade = "B";
    }
    else if (average >= 80){
      grade = "B-";
    }
    else if (average >= 77){
      grade = "C+";
    }
    else if (average >= 73){
      grade = "C";
    }
    else if (average >= 70){
      grade = "C-";
    }
    else if (average >= 67){
      grade = "D+";
    }
    else if (average >= 63){
      grade = "D";
    }
    else if (average >= 60){
      grade = "D-";
    }
    else if (average < 60){
      grade = "F";
    }
    System.out.println("the average grade was: " + grade);

  }
}
