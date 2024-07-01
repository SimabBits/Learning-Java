import java.util.Arrays;
import java.util.Scanner;

public class FindRichest {

  public static int richestPerson(int[][] Account) {
    int maxAmount = 0;
    int currentMax = 0;
    int count = 0;
    for (int i = 0; i < Account.length; i++) {
      for (int j = 0; j < Account[i].length; j++) {
        maxAmount += Account[i][j];
      }
      if (currentMax < maxAmount) {
        count = i;
        currentMax = maxAmount;
      }
      maxAmount = 0;
    }
    System.out.println("\nMaxAmount: " + currentMax);
    return count;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of persons: ");

    int m = sc.nextInt();

    int[][] Accounts = new int[m][];

    for (int i = 0; i < Accounts.length; i++) {
      System.out.println("Enter the number of Accounts of person " + (i + 1));
      int n = sc.nextInt();
      Accounts[i] = new int[n];
    }

    for (int i = 0; i < Accounts.length; i++) {
      System.out.println("Enter the Amount of person:" + (i + 1));
      for (int j = 0; j < Accounts[i].length; j++) {
        Accounts[i][j] = sc.nextInt();
      }
    }
    System.out.println("\nThe Given Account detail: ");
    int person = 1;
    for (int[] is : Accounts) {
      System.out.println("Account of person " + (person++) + " " + Arrays.toString(is));
    }

    int ans = richestPerson(Accounts);

    System.out.println("The Account of richest person is: " + Arrays.toString(Accounts[ans]));

    sc.close();
  }
}