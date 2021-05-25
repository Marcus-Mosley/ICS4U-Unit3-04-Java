import java.util.Random;
import java.util.Scanner;

/**
* The Hanoi program implements an application that
* solves the Tower of Hanoi Problem.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-28
*/
class Hanoi {
  /**
  * The solve method solves the problem.
  */
  public static void solve(int ndisks, int start, int end) { 
    if (ndisks == 1) {
      System.out.printf("\nMove disk 1 from peg " + start + " to peg " + end + "\n");
    } else {
      solve(ndisks - 1, start, 6 - start - end);
      System.out.printf("\nMove disk " + ndisks + " from peg " + start + " to peg " + end + "\n");
      solve(ndisks - 1, 6 - start - end, end);
    }
  }

  /**
  * The Main method receives input and checks viability.
  */
  public static void main(String[] args) {
    int ndisks;
  
    System.out.print("Towers of Hanoi Problem\n");

    // Input
    Scanner input = new Scanner(System.in);
    System.out.print("\nHow many disks would you like in your tower?: ");
    ndisks = input.nextInt();

    // Process
    solve(ndisks, 1, 3);

    // Output
    System.out.printf("\nSolved");
  }
} 