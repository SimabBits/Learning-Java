
public class FindEvens {

  public static int FindNumbers(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      int temp = arr[i];
      int j = 0;
      while (temp != 0) {
        temp = temp / 10;
        j = j + 1;
      }
      if (j % 2 == 0) {
        count = count + 1;
      }
    }
    return count;
  }

  public static void main(String[] args) {

    int[] array = { 121, 1221, 1, 2, 22 };

    System.out.println(FindNumbers(array));

  }
}
