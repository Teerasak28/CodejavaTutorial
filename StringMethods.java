public class StringMethods {
    public static void main(String[] args) {
        String message = "Java is Great Fun";
        //เมดธอดพื้นฐาน
        // 1.toUpercase() ปรับค่าข้อความให้เป็นตัวพิมพ์ใหญ่ 
        // 2.toLowercase() ปรับค่าข้อความให้เป็นตัวพิมพ์เล็ก
        // 3.length() เก็บข้อความของสติง
        // 4.charAt(2) บอกให้เก็บตัวอักษรตามจำนวนพารามีเตอร์
        String upper = message.toUpperCase();
        System.out.println(upper);

        String Lower = message.toLowerCase();
        System.out.println(Lower);

        int length = message.length();
        System.out.println(length);

        char charAt = message.charAt(0);
        System.out.println(charAt);
    }
    
}
