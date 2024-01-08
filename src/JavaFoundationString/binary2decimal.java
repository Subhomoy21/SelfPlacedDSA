package JavaFoundationString;

public class binary2decimal {
    static int binary_to_decimal(String str) {
        // Code here
        int m = 0;
        int k = 1;
        for(int i = str.length()-1; i>=0;i--){
            m = m + (str.charAt(i) - '0') * k; // subtracting 0 because to convert it to int value
            k = k*2;
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(binary_to_decimal("1000001"));
    }
}
