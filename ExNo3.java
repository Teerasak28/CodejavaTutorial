public class ExNo3 {
    public static void main(String[] args) {
        int motherNumber = 8;
        System.out.println("ตารางสูตรคูณแม่ " + motherNumber + ":");
        for (int i = 1; i <= 12; i++) {
            int result = motherNumber * i;
            System.out.println(motherNumber + " x " + i + " = " + result);
        }
    }
}
    