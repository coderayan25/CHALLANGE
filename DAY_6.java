/*
! Write a program to print all the prime factors of a number. 
@ The prime factors of a number are the prime numbers that multiply together to make that original number.

.1. Start by dividing the number by the smallest prime number.
.2. If it divides evenly, keep dividing until it doesn't.
.3. Move to the next smallest prime numbers (3,5,7, etc.) until you are left with 1.
? Input 18 = Output: [2, 3, 3]
*/

import java.util.Scanner;

public class DAY_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    int n = num;
    System.out.println("Prime factors of " + num + " are:");
    while (n % 2 == 0) {
      System.out.print(2 + " ");
      n /= 2;
    }
    for (int i = 3; i <= n; i += 2) {
      while (n % i == 0) {
        System.out.print(i + " ");
        n /= i;
      }
    }
    if (n != 1) {
      System.out.print(n);
    }
    sc.close();
  }
}
