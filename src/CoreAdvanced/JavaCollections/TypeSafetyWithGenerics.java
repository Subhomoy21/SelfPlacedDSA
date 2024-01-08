package CoreAdvanced.JavaCollections;

// With generics (shows compiler error)
// it ensures type safety
class Pair1<T,S> // generics
{
    T x;
    S y;
}
public class TypeSafetyWithGenerics {
    public static void main(String[] args) {
        Pair1<Integer,String> p1 = new Pair1<>();
        p1.x = 12;
        p1.y = "Subhomoy";
        //String str = (String)p1.x;
    }
}
