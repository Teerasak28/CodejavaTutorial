import java.util.*;
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList nameList = new ArrayList<>();
        nameList.add("Ball");
        nameList.add("Java");
        nameList.add("Micro");
        System.out.println("The ArrayList has "+nameList.size()+" objects stored in it.");
        for(int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
    }
}
