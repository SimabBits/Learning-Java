import java.util.Scanner;

public class LinearSearch {

  public static int linearSearch(String arr, char key) {
    for (int i = 0; i < arr.length(); i++) {
      if ((arr.charAt(i)) == key) {
        return i = i + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String arg = new String();

    System.out.println("Enter the string ");
    arg = sc.nextLine();
    System.out.println("Enter the key");
    char key = sc.next().charAt(0);

    int pos = linearSearch(arg, key);
    if (pos != -1)
      System.out.println("Found at position " + pos);
    else
      System.out.println("Not Found!");

    sc.close();

  }
}