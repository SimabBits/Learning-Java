import java.util.Scanner;

public class Array {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int[][] arr = new int[4][4];

System.out.println("Enter the elements of matrix");

    for (int i=0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        arr[i][j]=sc.nextInt();
      }
    }

    for (int i=0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
System.out.println("");
    }


  }
}