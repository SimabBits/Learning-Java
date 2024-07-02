import java.util.Scanner;

public class SmallestCharacterProblem {

  static char findSmallestCharnext(char[] arr, int target) {

    int s = 0;
    int e = arr.length - 1;
    while (s <= e) {
      int mid = s + (e - s) / 2;

      if (arr[mid] == target) {
        return arr[mid + 1];
      } else if (arr[mid] < target) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
    }
    return arr[s];
  }

  public static void main(String[] args) {
    /*
     * given an character array in non decending order
     * find the smallest character that is larger than the target
     */

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array ");
    int size = sc.nextInt();

    char[] array = new char[size];
    System.out.println("Enter the characters in the array");
    for (int i = 0; i < array.length; i++) {

      array[i] = sc.next().charAt(0);

    }

    System.out.println("Enter the target character ");

    char key = sc.next().charAt(0);

    System.out.println("The provided array ");
    for (char c : array) {
      System.out.print(c + " ");
    }

    System.out.println("\nThe Next smallest greatest charachter in the array is: " + findSmallestCharnext(array, key));

  }
}