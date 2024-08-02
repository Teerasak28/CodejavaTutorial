import java.util.Scanner;
public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาป้อนตัวเลข: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " เป็นเลขคู่");
        } else {
            System.out.println(number + " เป็นเลขคี่");
        }
        scanner.close();
    }
}
