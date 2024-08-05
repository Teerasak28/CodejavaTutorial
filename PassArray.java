import java.util.*;
public class PassArray {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        int [ ] numbers = new int[ARRAY_SIZE];
        getValues(numbers);
        System.out.println("Her are the number that you entered : ");
        showValue(numbers);
    }
    private static void getValues(int[ ] array){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter aseries of " +array.length+ " numbers.");
        for(int index = 0; index < array.length; index++){
            array[index] = in.nextInt();
        }
    }
    private static void showValue (int [ ] array){
        for(int index = 0; index < array.length; index++){
            System.out.println(array[index]+ " ");
        } 
    }
    
}
