import java.util.Scanner;
public class Ex5_3 {
    public static int findMaximum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int max = findMaximum(num1, num2);
        System.out.println("The maximum value is: " + max);
        scanner.close();
    }
}