import java.util.Scanner;

public class DAY_5 {
  public static void main(String[] args) {
    System.out.println("\n\n\t-:DAY 5 CHALLANGE:-\nWrite a program to Draw this pattern.\n");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
          System.out.print("* ");
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
