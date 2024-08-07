public class Studen {
    private String id;
    private String name;
    private double gpa;
    public void setDataills(String ID, String n, double GPA){
        id = ID;
        name = n;
        gpa = GPA;
    }
    public void showDataills(){
        System.out.println("ID : " +id);
        System.out.println("NAME : " +name);
        System.out.println("GPA : " +gpa);
    }
    public static void main(String[] args) {
        Studen sc1 = new Studen();
        sc1.setDataills("12123", "teerasak" , 3.50);
        sc1.showDataills();
        Studen sc2 = new Studen();
        sc2.setDataills("34123", "good", 3.80);
        sc2.showDataills();
    }
}
