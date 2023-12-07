package JavaFoundationString;

public class decimal2Binary {
    static void toBinary(String N)
    {
        // Code here
        int num = Integer.parseInt(N); // very important part
        if(num==0){
            System.out.print("0");
            return;
        }
        String s = "";
        while(num>0){
            s = (num%2) + s;
            num = num/2;
        }
        System.out.print(s);
    }
    public static void main(String[] args) {
        toBinary("10");
    }
}
