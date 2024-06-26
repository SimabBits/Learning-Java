import java.util.Scanner;

public class InputFunc {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter an Integer number: ");
        int intNum = sc.nextInt();
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);  // Fixed typo: charAT -> charAt
        System.out.println("Enter a floating point number: ");
        float fNum = sc.nextFloat();
        System.out.println("Enter a Long Integer number: ");
        long longNum = sc.nextLong();  // Changed variable name to avoid conflict
        System.out.println("Enter a boolean value: ");
        boolean isTrue = sc.nextBoolean();

        // Print the values
        System.out.println("Integer: " + intNum);
        System.out.println("Character: " + ch);
        System.out.println("Floating point number: " + fNum);
        System.out.println("Long Integer: " + longNum);
        System.out.println("Boolean: " + isTrue);
    }
}
