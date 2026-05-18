import java.util.Scanner;

public class DAY_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int s = 0; s < i; s++) {
        System.out.print("  ");
      }
      for (int j = 0; j <= n - i - 1; j++) {
        System.out.print((char) ('A' + j) + " ");
      }
      System.out.println();
    }
    for (int i = 0; i < n - 1; i++) {
      for (int s = 1; s < n - i - 1; s++) {
        System.out.print("  ");
      }
      for (int j = 0; j <= i + 1; j++) {
        System.out.print((char) ('A' + j) + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
