package ExtraPractise;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SparseArray {
     static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
         List<Integer> result= new ArrayList<>();
         int counter = 0;
         for(int i = 0; i < queries.size() ; i++){
             for(int j = 0; j < stringList.size(); j++){
                 if(queries.get(i).equals(stringList.get(j))){
                     counter++;
                 }
             }
             result.add(counter);
             counter = 0;
         }
         return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    List<String> stringList = new ArrayList<>();
    List<String> queries = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            stringList.add(sc.nextLine());
            System.out.println(stringList.get(i));
        }
        for (int i = 0; i < queries.size(); i++) {
            queries.add(sc.nextLine());
            System.out.println(queries.get(i));
        }
        System.out.println(matchingStrings(stringList,queries));
    }
}
