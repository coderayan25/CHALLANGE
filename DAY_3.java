//. DAT 3 CHALLANGE
//@ Write a program to print all fibonacci numbers upto n which are also prime number.

import java.util.Scanner;

public class DAY_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    int a = 0, b = 1;
    boolean isPrime;
    System.out.println("Fibonacci numbers which are also prime:-");
    while (a <= n) {
      isPrime = true;
      if (a < 2) {
        isPrime = false;
      } else {
        for (int i = 2; i * i <= a; i++) {
          if (a % i == 0) {
            isPrime = false;
            break;
          }
        }
      }
      if (isPrime)
        System.out.print(a + " ");
      int temp = a + b;
      a = b;
      b = temp;
    }
    sc.close();
  }
}