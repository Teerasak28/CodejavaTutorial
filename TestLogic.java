public class TestLogic {
    public static void main(String[] args) {
        /*
         * ตัวดำเนินการแบบสัมพันธ์
         * > มากกว่า
         * < น้อยกว่า
         * == เท่ากับ
         * >= มากกว่าเท่ากับ
         * <= น้อยกว่าเท่ากับ
         * != ไม่เท่ากัย
         * ตัวอย่าง
         * 6 > 7 false
         * 6 < 7 true
         * ตัวอย่างดำเนินการตรรกศาสตร์
         * true/false
         * && AND และ (8 > 7 && 10 == 10)
         * true && true = true
         * false && true = false
         * false && false = false
         * 
         * || or หรือ (8 > 7 || 10 > 10)
         * true && true = true
         * false && true = true
         * false && false = false
         * 
         * not ไม่
         
         */ 
        int x = 6, y = 9;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x == y);
        System.out.println(x != 6);
        System.out.println((x < y) && (y > 3));
        System.out.println((x == 5) || (y > 2));
        System.out.println(!(y > x));



    }
    
}
