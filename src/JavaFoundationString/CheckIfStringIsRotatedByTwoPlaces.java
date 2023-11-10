package JavaFoundationString;

public class CheckIfStringIsRotatedByTwoPlaces {
     static boolean isRotated(String str1, String str2)
    {
        // Your code here
        char[] check1 = str1.toCharArray();
        char[] check2 = str1.toCharArray();
        //   char[] check3 = str2.toCharArray();
        rotateclk(check1);
        rotateclk(check1);
        if(String.valueOf(check1).equals(str2)){
            return true;
        }

        rotateAnticlk(check2);
        rotateAnticlk(check2);
        if(String.valueOf(check2).equals(str2)){
            return true;
        }
        return false;
    }
     static void rotateclk(char[]s){
        char ch = s[s.length-1];
        int i = s.length-2;
        while(i>=0){
            s[i+1] = s[i];
            i--;
        }
        s[0] = ch;
    }
     static void rotateAnticlk(char[]s1){
        char ch = s1[0];
        int i = 1;
        while(i<s1.length){
            s1[i-1] = s1[i];
            i++;
        }
        s1[s1.length-1] = ch;
    }
    public static void main(String[] args) {
        String s1 = "amazon";
        String s2 = "azonam";
        System.out.println(isRotated(s1,s2));
    }
}
