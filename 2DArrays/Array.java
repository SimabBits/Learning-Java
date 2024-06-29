import java.util.Arrays;
import java.util.Scanner;

public class Array {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int[][] arr = new int[4][4];

    System.out.println("Enter the elements of matrix");

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    for (int[] row : arr) {
      System.out.println(Arrays.toString(row));
    }

    sc.close();
  }
}