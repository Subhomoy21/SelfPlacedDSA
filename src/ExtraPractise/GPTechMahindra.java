package ExtraPractise;

import java.util.Scanner;

public class GPTechMahindra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int t = sc.nextInt();
            int r = t/s; // common ratio
            int a = s/r; // first term
            int result = a * (int)(Math.pow(r,n-1));
            System.out.println(result + " ");
        }
        while (true);
    }
}
