import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> arr = new ArrayList<Integer>();

    System.out.println("Enter the number of elements in the array");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }

    for (Integer i : arr) {
      System.out.print(i + " ");
    }

    sc.close();

  }

}