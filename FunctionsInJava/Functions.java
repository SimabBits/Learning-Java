import java.util.Scanner;

public class Functions{

public static int sumOfNumbers(int a, int b){
return a + b;
}

public static void main(String args []){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the first value");

int a = sc.nextInt();

System.out.println("Enter the second value");

int b = sc.nextInt();

int ans = sumOfNumbers(a , b);

System.out.println("Answer: "+ ans);

}
}