package JavaFoundationString;

public class findExtraCharBitwise {
  static char findExtra(String s1,String s2){
      int res = 0;
      int  n = s1.length();
      for(int i = 0;i<n;i++){
          res = res^s1.charAt(i)^s2.charAt(i);
      }
      res = res ^ s2.charAt(n);
      return(char)res;
  }
    public static void main(String[] args) {
        System.out.println(findExtra("abc","acba"));
    }
}
