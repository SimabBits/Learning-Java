import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    System.out.println("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    int[] arr = new int[size];

    System.out.println("Enter a Shorted array ");

    for (int i = 0; i < arr.length; i++) {

      arr[i] = sc.nextInt();

    }

    System.out.println("Enter the key to find: ");
    int key = sc.nextInt();
    System.out.println(binarySearch(arr, key));

    sc.close();

  }

  static int binarySearch(int[] arr, int target) {
    int s = 0;
    int e = arr.length - 1;
    boolean check = arr[s] < arr[e];
    while (s <= e) {
      int mid = s + (e - s) / 2;

      if (arr[mid] == target) {
        return mid;
      }

      if (check) {

        if (arr[mid] > target) {
          e = mid - 1;
        } else {
          s = mid + 1;
        }

      } else {

        if (arr[mid] < target) {
          e = mid - 1;
        } else {
          s = mid + 1;
        }

      }

    }
    return -1;

  }

}
