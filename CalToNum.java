import java.util.Scanner;

public class CalToNum {
    public static void main(String[] args) {
        int number,x,y;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 1,2,3,4 : ");
        number = keyboard.nextInt();
        switch(number){
            case 1 :
            System.out.println("You enter 1.");
            System.out.print("Input Number1 : ");
            x = keyboard.nextInt();
            System.out.print("Input Numbe2 : ");
            y = keyboard.nextInt();
            System.out.println("Result is : " +x+ " + " +y+ " = " +(x+y));
            break;
            case 2 :
            System.out.println("You enter 2.");
            System.out.print("Input Number1 : ");
            x = keyboard.nextInt();
            System.out.print("Input Numbe2 : ");
            y = keyboard.nextInt();
            System.out.println("Result is : " +x+ " - " +y+ " = " +(x-y));
            break;
            case 3 :
            System.out.println("You enter 3.");
            System.out.print("Input Number1 : ");
            x = keyboard.nextInt();
            System.out.print("Input Numbe2 : ");
            y = keyboard.nextInt();
            System.out.println("Result is : " +x+ " * " +y+ " = " +(x*y));
            break;
            case 4 :
            System.out.println("You enter 4.");
            System.out.print("Input Number1 : ");
            x = keyboard.nextInt();
            System.out.print("Input Numbe2 : ");
            y = keyboard.nextInt();
            System.out.println("Result is : " +x+ " / " +y+ " = " +(x/y));
            break;
            default:
            System.out.println("That's not a correct number!");

        }
    }
}