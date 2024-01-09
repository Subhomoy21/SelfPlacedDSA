package CoreAdvanced.JavaCollections;

import java.util.ArrayList;

class student{

}
class enggStudent extends student{

}
public class wildCardCharacterInGenerics {
    public static void main(String[] args) {
        ArrayList<?> al1 = new ArrayList<>();
        ArrayList<enggStudent> al2 = new ArrayList<enggStudent>();
        al1 = al2; // it compiles and run fine
    }
}
