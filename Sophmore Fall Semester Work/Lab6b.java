/* Instructions for lab6b:
You will need to create 3 loops; each will print out a word within our matrix to the terminal.
Rules: 1.Each loop MUST print its values from the matrix directly, this means a System.out.print(board[value][value])
2. Each iteration may only output 1 char from the matrix(cannot just hardcode in all addresses to an output line - see rule 3)
3. At least 1 of the required 2 addresses for a matrix element MUST BE SUPPLIED BY YOUR LOOPS COUNTER VARIABLE! Only
one of the pair may be hardcoded at a max! Hardcoded each address for output will get no points.

Hints:
Loop control test: Determine where the word is located, write down the addresses for each letter, determine where the word starts and stops
and have this determine where you start your 'place' variable and where the traversal must stop
Each loop should only have 2 commands, the Output line and a 'place' increment
Determine output addresses: Look at your set of addresses that contain your word, notice which(row or col) change and which stay the same
The one that changes will have to be where your loops 'place' variable is used and the one that stays the same can be hardcoded.
*Note: a word that goes diag across the matrix cannot have any addresses hardcoded and will need a bit more tact in traversing both
dimenions of the matrix at the same time.
Between your loops be sure to print out a space character so the words don't mash together.

*/
import java.util.Arrays;
import javax.security.auth.kerberos.KerberosCredMessage;
public class Lab6b {
    public static void main(String args[]) {
      char[][] board = {
          {'s','t','i','n','k','s'},
          {'s','t','s','s','s','s'},
          {'s','s','o','s','s','s'},
          {'s','s','s','n','s','s'},
          {'s','d','a','n','k','s'},
          {'s','s','s','s','s','s'},
      };
      int a = 1;
      while (a < board.length-1){
        System.out.print(board[4][a] + " ");
        a++;
      }
      System.out.println();
      int len=board[0].length;
for (int i = 0; i < len; i++) {
        for (int j = 0; j < len; j++) {
            if (i == j){
                System.out.print(board[i][j] + " ");
            }
        }
    }
    System.out.println();
    int b = 0;
    while (b < board.length-1){
      System.out.print(board[0][b] + " ");
      b++;
    }
	//First Loop: Find and print the word 'dank' from the supplied matrix
	/*Walkthru:
Determine addresses:
4,1 d
4,2 a
4,3 n
4,4 k
Is a dimension not changing? Yes, row isnt changing. We are working in only 1 dimension of this matrix
Where do we start and end for our loops test condition? Look at the changing dimension(col) start at 1, end at 4
create a 'place' var, initialize it at your start, how would you set the limit of traversal to 4 using the matrix?
Whats is the boards length? Are there any chars after the values we want that we want to print? Yes, the s at 4,5
The boards length is 6, we have 1 char we want to omit after our word. So we want out loop to stay < board.length-1
Inside the loop we can hardcode in the row address but we will use the 'place' var to supply col, if we initialize
our 'place' correctly and limited our loop correctly we should print only the chars we want

*/


	//Second loop: Find and print the word 'stonks' from the supplied matrix


	//Third loop: Find and print the word 'stink' from the supplied matrix


    }
}
