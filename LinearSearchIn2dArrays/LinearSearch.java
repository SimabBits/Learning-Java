import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int m = sc.nextInt();

    int[][] array = new int[m][];

    for (int i = 0; i < array.length; i++) {
      System.out.println("Enter the number of columns for row " + i);
      int n = sc.nextInt();
      array[i] = new int[n];
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = sc.nextInt();
      }
    }

    System.out.println("Enter the value to search for");
    int key = sc.nextInt();

    int[] ans = linearSearch(array, key);

    printArray(ans);

    sc.close();

  }

  public static int[] linearSearch(int[][] array, int key) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] == key)
          return new int[] { i, j };
      }
    }
    return new int[] { -1, -1 };
  }

  public static void printArray(int[] array) {
    for (int i : array) {
      System.out.print(i + " ");
    }
  }
}