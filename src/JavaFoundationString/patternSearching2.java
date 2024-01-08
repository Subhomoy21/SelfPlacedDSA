package JavaFoundationString;

import java.util.Scanner;

public class patternSearching2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the string :");
            String str = sc.nextLine();
            System.out.println("Enter the pattern which is similar to the above string:");
            String pat = sc.nextLine();
            for (int i = 0; i < str.length()-pat.length()+1; i++) {
                if(str.substring(i,i+ pat.length()).equals(pat)){
                    System.out.print(i + " ");
                }
                else{
                    System.out.println("Not matching pattern:");
                    break;
                }
            }
            System.out.println();
        }
        while (true);

    }
}
