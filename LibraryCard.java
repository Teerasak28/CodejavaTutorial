public class LibraryCard {
    private Student owner;
    private int brorowcont;
    private LibraryCard(){
        owner = null;
        brorowcont = 0;
    }
    public void checkOut(int numOfBooks){
        brorowcont = brorowcont + numOfBooks;
    }
    public void setOwenerName(Student student){
        owner = student;
    }
    public int getNumberOfBooks(){
        return brorowcont;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public String toString(){
        return "Owner Name" +owner.getName()+"\n"+"Email"+owner.getEmail()+"\n"+"Books Borrowed" +brorowcont;
    }
}
