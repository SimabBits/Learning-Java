
import java.util.Scanner;

public class PaintersProblem {

    static boolean ispossible(int[] arr, int m, int mid) {
        int partition = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (sum + arr[i] <= mid) {
                sum += arr[i];
            } else {

                partition++;

                if (arr[i] > mid || partition > m) {
                    return false;
                }

                sum = arr[i];

            }

        }
        return true;
    }

    static int split(int[] arr, int m) {

        int s = Integer.MAX_VALUE;
        int e = 0;
        int ans = 0;

        for (int el : arr) {
            s = Math.min(s, el);
            e = e + el;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (ispossible(arr, m, mid)) {
                ans = mid;
                e = mid - 1;

            } else {

                s = mid + 1;

            }

        }

        return ans;

    }

    public static void main(String[] args) {

        int[] arr = {12, 20, 14, 8, 11};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of allowed partition");

        int m = sc.nextInt();

        int result = split(arr, m);

        System.out.println("Answer:" + result);

        sc.close();

    }

}
