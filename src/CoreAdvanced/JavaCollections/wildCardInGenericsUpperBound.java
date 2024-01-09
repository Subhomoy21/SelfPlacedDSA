package CoreAdvanced.JavaCollections;
//
import java.util.*;

class students{

}
class enggStudents extends students{

}
public class wildCardInGenericsUpperBound {
    public static void main(String[] args) {
        ArrayList<? extends students> al1 = new ArrayList<>();
        ArrayList<enggStudents> al2 = new ArrayList<>();
        al1 = al2; // it compiles successfully
    }
}
