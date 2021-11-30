/*
Assignment 3: This assignment is about building an Array that is sorted from its inception.
We have Arrays.Sort that can sort an existing array into order. But to understand how that actually works we need to manually perform a sort operation
An InsertSort will apply sorting logic from the very first value we place into an array.
Lets say we have a series of values to input into an array (4, 13,2, 9,5)
Here is our array: _ _ _ _ _ _
Generally, an insertSort is setup with a for loop. Lets call its counter "i" for simplicity "i" is set to the value of count-1.
Remember what count is, its used to represent the number of values present in an array(since they are rarely totally full)
Count-1 would put us at the actual address of the last populated array element.
Each value as it comes into the array comes in from the right hand side, the first value it encounters we do a compare to
newvalue < array[i] tests last value to see if new value is less than it. Also, we need to make sure i>=0 or we will run off the front of the array!
We can manually figure out the small sample data above will make a sorted array that is 2 4 5 9 13, but how to we get it into that format from what we have?
4 is inserted first, count would be 0 at that time, using the logic test above that for the loop to keep going the newval has to be less than the last item
in the array and "i" has to be more than or equal to 0.
Right now, there are no values in the array to test less than to, since "i" is count-1(0-1) so -1 the loop should fail. What now? Loop failure means you are at an
acceptable address for insertion, the insertion will be done at [i+1], in this case [-1 + 1] or 0. 4 will go to array[0]
4 _ _ _ _ _  ------ 13 is next up
4 13 _ _ _ _ ------- 2 is next
2 4 13 _ _ _ -------- 9 is next
2 4 9 13 _ _ ------- 5 is last
2 4 5 9 13 _
An insertion sort will ONLY work on an array with at least 1 empty place in it, a full array will fail at insertion as i+1 will run off the edge of it.

*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class A3
{
	static final int MAX_CAPACITY = 30;  // HARDCODED PLENTY BIG. WE'LL DO TRIM AFTER

	public static void main( String args[] ) throws Exception
	{
		if(args.length<1)
		{
				System.out.println("Please provide the input file name");
		}
		else
		{
			int[] array=new int[MAX_CAPACITY];
			int count=0;
			Scanner file;
			try
			{
				file=new Scanner(new File(args[0]));
			while(file.hasNextInt())
			{
					int value=file.nextInt();
					insertInOrder(array,count,value);
					count++;
			}
			System.out.println("Before trim "+array.length);

			array=trimArray(array,count);

			System.out.println("After trim "+array.length);

			printArray(array,count);
		}
	  catch(FileNotFoundException e) {
	 		 e.printStackTrace();
	  }

	 }


	 }
	 private static void insertInOrder(int[] array,int count,int value)
	 {
	int i;
					for(i = count - 1; i >= 0; i--)
        {
						if (value < array[i]){
							array[i+1] = array[i];
						}
						else {
							break;
						}
					}
					array[i+1] = value;
				}



		 // create a counter variable for the for loop, a counter declared on the same line as the for will NOT work as it will be limited to only existing in the loop
		 // approach insertinorder from the right hand(high side) of the array. count will not work as a starting point as count is the # of values stored
		 // we need the address of the last value stored.
		 // If the newVal is less than the value being looked at in the array, move that current value to counter+1 position. Move it to the right, then proceed through
		 // the array to the left.
		 //Be careful NOT to run of the front of the array so also test to make sure counter >=0.
		 //The loop is solely moving items out of the inserts way. When the loop reachs a breaking condition, then insert the newVal at the address counter+1.



	 private static void printArray(int[] array,int count)
	 {
			 System.out.println("The elements of Array: ");
			 for(int i=0;i<count;i++)
					 System.out.print("\n"+array[i]);
	 }

	 private static int[] trimArray(int[] array,int count)
	 {
			 int[] trimedarray;
			 trimedarray=Arrays.copyOfRange(array,0,count);
			 return trimedarray;
	 }
}
		//Item 1: Test to make sure a file name was provided to the args[] array. If less than 1 output a message telling user to supply a name
		// for the program to use for input. i.e. java A3 A3input.txt

		//Item 2: Declare an int array and use the constant MAX_CAPACITY to set its size. Also, declare a count variable and set to 0

		//Item 3: Create your scanner object to read from the input file, for the File object use the name supplied by args[0]
		//Item 4: The file reading loop
		//Use the scanners .hasNextInt method to control this loop
		// Pull an int value from the file( using .nextInt() works perfectly for this)
		//Call insertInOrder method, note the required arguments it needs when being called insertInOrder(the array,count variable,value pulled in from file)
		// dont forget to increment count
		//End Item 4 Loop


		//Item 5: Call the trimArray method to get rid of the excess empty values
		//Item 6: call printArray method

		// create a counter variable for the for loop, a counter declared on the same line as the for will NOT work as it will be limited to only existing in the loop
		// approach insertinorder from the right hand(high side) of the array. count will not work as a starting point as count is the # of values stored
		// we need the address of the last value stored.
		// If the newVal is less than the value being looked at in the array, move that current value to counter+1 position. Move it to the right, then proceed through
		// the array to the left.
		//Be careful NOT to run of the front of the array so also test to make sure counter >=0.
		//The loop is solely moving items out of the inserts way. When the loop reachs a breaking condition, then insert the newVal at the address counter+1.

 		// END A3
