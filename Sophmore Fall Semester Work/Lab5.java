import java.io.*; // I/O
import java.util.*; // Scanner class

public class Lab5
{

	public static void main( String args[] )
	{

		int[] arr = { 13, 5, 7, 11, 23, 15, 6, 31, 91, 27, 14, 41, 55, 14 };
		int arrprod = 1;
		int arrmax = 0;
		int arrmin = 1000;
		double arrave = 0;
		for (int i = 0; i < arr.length; i++){
			arrave += arr[i];
		}
		arrave = arrave / arr.length;


		for ( int i=0 ; i<arr.length ; ++i ) //Sample loop that will process through an entire array.
		{
			if (arrmax < arr[i]){
				arrmax = arr[i];
			}
		}
		for ( int i=0 ; i<arr.length ; ++i ) //Sample loop that will process through an entire array.
		{
			if (arrmin > arr[i]){
				arrmin = arr[i];
			}
		}
		for ( int i=0 ; i<arr.length ; ++i ) //Sample loop that will process through an entire array.
		{
			arrprod *= arr[i];
			}




		System.out.println( "The smallest number in the array is: " + arrmin );
		System.out.println( "The largest number in the array is: " + arrmax );
		System.out.println( "The average of the numbers in the array is: " + arrave );
		System.out.println( "The product of the numbers in the array is: " + arrprod );


	} // END MAIN METHOD



} // END CLASS Lab5
