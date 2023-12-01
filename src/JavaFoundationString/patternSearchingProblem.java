package JavaFoundationString;

public class patternSearchingProblem {
    static void patSearch(String txt,String pat){
        int pos  = txt.indexOf(pat);
        while(pos>=0){
            // little silly but very conceptual
            System.out.print(pos + " ");
            pos = txt.indexOf(pat,pos + 1);
        }
    }
    static String digitsAfterDecimal(String number){
        int pos = number.indexOf('.');
        if(pos<0){
            return " ";
        }
        else{
            return number.substring(pos+1); // again very silly but logically interesting
        }
    }
    public static void main(String[] args) {
        // rough
        String t1 = "geeks for geeks";
        String t2 = "for";
        System.out.println(t1.indexOf(t2));
        patSearch("Subhomoy Das holds the title Das","Das");
        System.out.println();
        System.out.println(digitsAfterDecimal("54.255885554646"));

    }
}
