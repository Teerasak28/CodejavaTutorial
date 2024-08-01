import java.util.Scanner;
public class TestGrade {
    public static void main(String[] args) {
        int score;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your score: ");
        score = in.nextInt();
        if(score < 50){
            //Statement1
            System.out.println("Your grade is F ");
        }
        else if(score < 60){
            //Statement2
            System.out.println("Your grade is D ");

        }
        else if(score < 70){
            //Statement3
            System.out.println("Your grade is C ");    
        }
        else if(score < 80){
            //Statement4
            System.out.println("Your grade is B ");    
        }
        else if(score <= 100){
            //Statement5
            System.out.println("Your grade is A ");
        }
        else
        {
            System.out.println("Invalid score. ");
        }
    }
}