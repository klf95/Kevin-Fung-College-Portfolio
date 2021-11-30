import java.util.*;
import java.io.*;
public class Lab7
{
    public static void main(String args[]) throws Exception
    {
        if (args.length < 1)
        {
            System.out.println("usage: $ java Lab1 Requires a filename to read from!");
            // System.exit(0);
        }
        //create arrayList
        ArrayList<Integer> nums = new ArrayList<Integer>();

        Scanner screenscanner = new Scanner(System.in);  // Create a Scanner object

        Scanner scanner = new Scanner(new File(args[0]));
        while(scanner.hasNextInt())
        {
            nums.add(scanner.nextInt());
        }

        //call printArrayList
        printArrayList(nums);
        //print length of arrayList
        System.out.printf("Length of arrayList: %d", nums.size());
        System.out.print('\n');
        System.out.print("Enter a number to remove: ");
        // store entered value into target
        int target = screenscanner.nextInt();
        // get index for target into idx
        int idx = nums.indexOf(target);
        //remove item in the index idx
        nums.remove(idx);
        //call printArrayList
        printArrayList(nums);
        //print length of arrayList
        System.out.printf("Length of arrayList: %d", nums.size());
        System.out.print('\n');
    }

    static void printArrayList(ArrayList<Integer> array)
    {
        for (int i : array)
        {
            System.out.println(i);
        }
    }
}
