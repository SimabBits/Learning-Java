import java.util.Scanner;

public class SearchingInMountainArray {

	static int binarySearch(int[] array, int target, int s, int e, boolean accending) {

		while (s <= e) {

			int mid = s + (e - s) / 2;

			if (array[mid] == target) {

				return mid;

			} else if (accending) {

				if (array[mid] < target) {

					s = mid + 1;

				} else {

					e = mid - 1;

				}

			} else {

				if (array[mid] > target) {

					s = mid + 1;

				} else {

					e = mid - 1;

				}

			}

		}

		return -1;

	}

	static int peakOfMountain(int[] arr) {

		int s = 0;
		int e = arr.length - 1;

		while (s < e) {

			int mid = s + (e - s) / 2;

			if (arr[mid] < arr[mid + 1]) {

				s = mid + 1;

			} else {

				e = mid;

			}

		}
		return e;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array");

		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elemnts of the array");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

		}
		System.out.println("Enter the target element:");
		int target = sc.nextInt();

		int peak = peakOfMountain(arr);
		int ans = -1, s, e;

		if (arr[peak] == target) {

			ans = peak;
			System.out.println("Found the target element at index:" + ans);

		}

		// Searching from start to peak

		if (ans == -1) {
			s = 0;
			e = peak - 1;
			ans = binarySearch(arr, target, s, e, true);

		}

		// Searching from peak to end

		if (ans == -1) {

			s = peak + 1;
			e = arr.length - 1;
			ans = binarySearch(arr, target, s, e, false);

		}

		System.out.println(ans != -1 ? "Found the target element at index:" + ans : "Target not found");

		sc.close();

	}
}