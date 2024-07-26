import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        String name;
        int hours;
        double payrate;
        double grossPay;
        Scanner t = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = t.nextLine();
        System.out.println("How many hours did work this week? ");
        hours = t.nextInt();
        System.out.println("What is your hourly pay rate? ");
        payrate = t.nextDouble();
        grossPay = hours * payrate;
        System.out.println("Hello"+name);
        System.out.println("your gross pay is"+grossPay);

    }
    
}
