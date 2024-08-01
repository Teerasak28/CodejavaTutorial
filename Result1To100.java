public class Result1To100 {
    public static void main(String[] args) {
        int  sum = 0 , i = 1;
        while (i <= 100) {
            System.out.println("result in whileLoop : "+i);
            sum += i;
            i++;
        }
        System.out.println("total result : " +sum); 
    }
}