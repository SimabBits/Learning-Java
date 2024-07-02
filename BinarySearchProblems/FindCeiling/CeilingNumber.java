import java.util.Scanner;

public class CeilingNumber {

  static int findCeilingNumber(int[] arr, int target) {
    int s = 0;
    int e = arr.length - 1;
    boolean isAccending = arr[s] < arr[e];
    if (isAccending) {
      while (s <= e) {
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
          return mid;
        } else if (arr[mid] < target) {
          s = mid + 1;
        } else {
          e = mid - 1;
        }
      }

      return s;

    } else {

      while (s <= e) {

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {

          return mid;

        } else if (arr[mid] > target) {
          s = mid + 1;
        } else {
          e = mid - 1;
        }
      }

      return e;
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array ");
    int size = sc.nextInt();

    int[] arr = new int[size];
    System.out.println("Enter the elements of the array ");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the key ");
    int key = sc.nextInt();

    System.out.println("The ceiling of the number is " + arr[findCeilingNumber(arr, key)]);

    sc.close();
  }
}