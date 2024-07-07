import java.util.Scanner;

public class PeakElement {

	static int peakElement(int[] arr) {

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
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements of the array ");

		for (int i = 0; i < array.length; i++) {

			array[i] = sc.nextInt();

		}

		System.out.println("Peak Element: " + array[peakElement(array)]);

		sc.close();

	}
}