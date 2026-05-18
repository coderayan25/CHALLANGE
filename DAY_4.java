import java.util.Scanner;

public class DAY_4 {
  public static void main(String[] args) {
    System.out.println("\n\n\t-:DAY 4 CHALLANGE:-\nWrite a program to wraw this pattern.\n");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if ((i == 0 || j == 0 || i == n - 1 || j == n - 1) || (i == j) || (j == n - i - 1)) {
          System.out.print((char) ('A' + j) + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    sc.close();
    System.out.println("\n\n");
  }
}
