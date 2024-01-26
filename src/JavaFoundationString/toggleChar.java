package JavaFoundationString;

import java.util.Scanner;

public class toggleChar {
    static char toggleChar(char ch){
        if(ch>='A' && ch<='Z'){
            char c = (char)(ch +32);
            return c;
        }
        else if (ch>='a' && ch<='z'){
            char c = (char)(ch-32);
            return c;
        }
        else{
            return'0';
        }
    }
    //converting the word totally in uppercase or in lowercase!
    static StringBuilder toggleChar1(String str){
        StringBuilder store = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                char x = (char)(ch + 32);
                store.append(x);
            }
            else if(ch>='a' && ch<='z'){
                char x = (char)(ch - 32);
                store.append(x);
            }
        }
        return store;
    }
    public static void main(String[] args) {
      // we have to toggle the random character
        Scanner sc = new Scanner(System.in);
        do {
            char ch = sc.next().charAt(0); // taking the input from scanner class for char
            System.out.println(toggleChar(ch));
        }
        while(false); // for infinite replace false into true!
        StringBuilder store = toggleChar1("subhomoy");
        System.out.println(store);

    }
}
