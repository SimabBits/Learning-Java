package LinearSearch;

import java.util.Scanner;

public class LinearSearch {

  public static int linearSearch(int[] arr, int key) {
    int index = 0;

    for (int i : arr) {
      if (key == i) {
        return index;
      }
      index++;
    }
    return -1;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];

    System.out.println("Enter the elements of the array");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the key value");
    int key = sc.nextInt();

    System.out.println("Index " + linearSearch(arr, key));
  }
}