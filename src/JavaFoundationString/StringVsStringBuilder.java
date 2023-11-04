package JavaFoundationString;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        // basically it is checking the mutable property of String class and StringBuilder Class!
        String s1 = "geeks";
        String s2 = s1;
        s1 = s1 + "forgeeks";
        if(s1==s2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
        StringBuilder sb1 = new StringBuilder("geeks");
        StringBuilder sb2 = sb1;
        sb1 = sb1.append("forgeeks");
        if(sb1==sb2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
}
