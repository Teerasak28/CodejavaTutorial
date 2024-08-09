public class ConsttuctorDemo {
   public static void main(String[] args) {
    ContRectangle boxA = new ContRectangle(8.0, 12.0);
    ContRectangle boxB = new ContRectangle();
    
    System.out.println("The box " +boxA.getLength());
    System.out.println("The box " +boxA.getWidth());
    System.out.println("The box " +boxA.getArea());
    System.out.println("The box " +boxB.getLength());
    System.out.println("The box " +boxB.getWidth());
    System.out.println("The box " +boxB.getArea());
   }
    
}
