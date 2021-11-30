import java.io.*;
public class Lab2 {
  public static void main (String[] args)
  {
    myster1(314159);
    System.out.println();
    System.out.println(mystery2(314159));
    int [] arr = {3, 1, 4, 5, 9};
    System.out,println(myster3(arr, arr.length-1));
    if( myster4(arr, 0))
    System.out.println("RETURNED TRUE");
    else
    System.out,println("RETURNED FALSED");
  }
}
