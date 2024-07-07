import java.util.Scanner;

public class FirstAndLastOccurance {

	public static int firstOccurance(int[] arr, int target) {

		int s = 0;
		int e = arr.length - 1;
		int result = -1;
		while (s <= e) {

			int mid = s + (e - s) / 2;

			if (arr[mid] == target) {

				result = mid;

				e = mid - 1;

			} else if (arr[mid] > target) {

				e = mid - 1;

			} else {

				s = mid + 1;

			}

		}

		return result;

	}

	public static int lastOccurance(int[] arr, int target) {

		int s = 0;
		int e = arr.length - 1;
		int result = -1;
		while (s <= e) {

			int mid = s + (e - s) / 2;

			if (arr[mid] == target) {

				result = mid;

				s = mid + 1;

			} else if (arr[mid] > target) {

				e = mid - 1;

			} else {

				s = mid + 1;

			}

		}

		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the Array");

		int size = sc.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the elements of the array");

		for (int i = 0; i < array.length; i++) {

			array[i] = sc.nextInt();

		}

		System.out.println("Enter the target");

		int key = sc.nextInt();

		int first = firstOccurance(array, key);
		int last = lastOccurance(array, key);

		System.out.println("First occurance " + first + " Last occurance " + last);

	}

}