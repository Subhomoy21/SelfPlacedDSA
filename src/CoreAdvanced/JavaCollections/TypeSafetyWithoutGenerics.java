package CoreAdvanced.JavaCollections;
// without generics (throws Classcast exception)
// not type safety!
class Pair{
    Object x;
    Object y;
}
public class TypeSafetyWithoutGenerics {
    public static void main(String[] args) {
        Pair p= new Pair();

        p.x=12;
        p.y="GFG";
        String str=(String)p.x;
    }
}
