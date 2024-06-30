public class FindEvens {
  public static int findNumbers(int[] array) {
    int count = 0;
    for (int num : array) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  public static boolean even(int number) {
    int numberOfDigits = numberOfDigits(number);
    return numberOfDigits % 2 == 0;
  }

  public static int numberOfDigits(int num) {
    if (num < 0) {
      num = num * -1;
    } else if (num == 0) {
      return 1;
    }

    int count = 0;
    while (num != 0) {
      count++;
      num /= 10;
    }

    return count;
  }

  public static void main(String[] args) {

    int[] array = { 1, 2, 324, 5213, 234 };

    System.out.println("Number of Even digits " + findNumbers(array));

  }

}