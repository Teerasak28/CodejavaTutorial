public class Librarian {
   public static void main(String[] args) {
    Student st1;
    LibraryCard card1, card2;
    st1 = new Student();
    st1.setName("jon java");
    st1.setEmail("jj@email.com");
    card1 = new LibraryCard();
    card1.setOwenerName(st1);
    card1.checkOut(3);
    card2 = new LibraryCard();
    card2.setOwenerName(st1);
    System.out.println("Card1 Info:");
    System.out.println(card1.toString()+"\n");
    System.out.println("Card2 Info:");
    System.out.println(card2.toString()+"\n");
   }
}
