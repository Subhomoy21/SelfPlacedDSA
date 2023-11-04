package Mathematics;

public class Gcd {
    // brute force solution !
    static int gcd(int a,int b){
        int res = Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }
    // using euclidean algo part1
    static int gdc1(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    // using euclidean algo part2
    static int gcd2(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(4,6));
        System.out.println(gdc1(4,6));
        System.out.println(gcd2(4,6));
    }
}
