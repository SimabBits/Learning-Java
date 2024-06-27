import java.util.Scanner;

public class Array{

public static void printArray(int[] arr){

for (int i = 0; i< 5; i ++){
System.out.print(arr[i]+" ");
}

}
public static void main(String args []){

int[] arr = new int[5];

Scanner sc = new Scanner(System.in);

System.out.println("Enter the elements of the array");

for (int i = 0; i< 5; i ++){
arr[i] = sc.nextInt();
}

printArray(arr);

sc.close();

}
}