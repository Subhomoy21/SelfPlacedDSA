package CoreAdvanced.JavaCollections;

import java.util.ArrayList;

class student1 {

}
class enggStudent1 extends student1{

}
public class wildCardInGenericsLowerBound {
    public static void main(String[] args) {
        ArrayList<? super student1> al1 = new ArrayList<>();
        ArrayList<Object> al2 = new ArrayList<>();
        al1 = al2;
    }
}
