import java.util.Scanner;

public class NumberInInfiniteArray {

   static int binarySearch(int[] arr, int s, int e, int target) {

      if (arr[s] > target) {

         return -2;

      }

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
      return -1;
   }

   static int findNumber(int[] arr, int target) {
      int length = 2;
      int result = -1;
      int s = 0;
      int e = length - 1;

      while ((result == -1) && (length < arr.length)) {
         if (target <= arr[s] && target >= arr[e]) {
            result = binarySearch(arr, s, e, target);
         }
         length = 2 * length;
         s = e;
         e = length;
      }

      return result;

   }

   public static void main(String[] args) {

      /*
       * Since it is not possible to enter infinite size array
       * we will assume the entered array as an infinite array
       */

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array");

      int size = sc.nextInt();

      int[] array = new int[size];

      for (int i = 0; i < array.length; i++) {

         array[i] = sc.nextInt();

      }

      System.out.println("Enter the target element");

      int target = sc.nextInt();

      int result = findNumber(array, target);

      System.out.println(result == -2 || result == -1 ? "Number not Found" : "Number found at index: " + result);

      sc.close();

   }

}
