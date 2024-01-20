package BitsMagic;

import java.util.Scanner;

public class onOffToggleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();

        // on(|or) , off(&and), toggle(^xor) ,checkingOnOff(| and &)
        int onmask = (1<<i);
        System.out.println(onmask);
        int offmask = ~(1<<j);
        System.out.println(offmask);
        int togglemask = (1<<k);
        System.out.println(togglemask);
        int check = (1<<l);
        System.out.println(check);

        System.out.println(n|onmask);
        System.out.println(n&offmask);
        System.out.println(n^togglemask);
        System.out.println((n & check)==0? false : true);
    }
}
