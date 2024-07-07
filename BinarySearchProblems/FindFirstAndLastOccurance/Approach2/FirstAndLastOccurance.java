import java.util.Scanner;
import java.util.Arrays;

public class FirstAndLastOccurance {

  static int binarySearch(int[] arr, int target, boolean firstOccurance) {

    int result = -1;
    int s = 0;
    int e = arr.length - 1;

    while (s <= e) {

      int mid = s + (e - s) / 2;

      if (arr[mid] == target) {

        result = mid;

        if (firstOccurance) {

          e = mid - 1;

        } else {

          s = mid + 1;

        }

      } else if (arr[mid] > target) {

        e = mid - 1;

      } else {

        s = mid + 1;

      }

    }

    return result;

  }

  static int[] firstAndLastOccurance(int[] arr, int target) {

    int[] ans = { -1, -1 };

    ans[0] = binarySearch(arr, target, true);
    ans[1] = binarySearch(arr, target, false);

    return ans;

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length of the range");

    int size = sc.nextInt();

    int[] range = new int[size];

    System.out.println("Enter the elements of the range");

    for (int i = 0; i < range.length; i++) {

      range[i] = sc.nextInt();

    }

    System.out.println("Enter the target element ");

    int target = sc.nextInt();

    System.out.println(Arrays.toString(firstAndLastOccurance(range, target)));

  }
}