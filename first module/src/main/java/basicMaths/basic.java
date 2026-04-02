package basicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class basic {


    int reverseNumber(int n){
        int rev = 0;

        while(n > 0){
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }

        return rev;
    }

    boolean Plaindrome(int n){
        int rev = 0;
        int original = n ;

        while(n > 0){
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }


//        if (original == rev) {
//            System.out.println("Palindrome Number");
//        } else {
//            System.out.println("Not Palindrome");
//        }

return original == rev;
    }

    void ArmstrongNumber(int n){
        int original = n;
        int sum  = 0 ;


        while(n > 0){
            int lastdigit = n % 10;


            sum = sum +lastdigit * lastdigit * lastdigit;
            n = n / 10;
        }

        if (sum == original){
            System.out.println("Armstrong Number");

        }
        else  {
            System.out.println("Not Armstrong");
        }

    }

    void PrintDivisor(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }

        }

    }

    void printDivisorsOptimized(int n){
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                list.add(i);

                if(n / i != i ){
                    list.add(n / i);
                }
            }
        }

        Collections.sort(list);

        for(int num : list){
            System.out.print(num + " ");
        }
    }

    public boolean checkPrime(int n) {
        int cnt = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                cnt++;
            }
        }

        return cnt == 2;
    }

    public boolean checkPrimeOptmized(int n) {
        int cnt = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                cnt++;

                if (n / i != i) {
                    cnt++;
                }
            }
        }
        return cnt == 2;
    }



    public static void main(String[] args) {
        basic a = new basic();
        int x = 13;
//        int digit = a.reverseNumber(x);
//
//        System.out.println("reverse of " + x  + " is = " + digit);
//
//        System.out.println(a.Plaindrome(x));
//
//        a.ArmstrongNumber(x);

//       a.PrintDivisor(x);
//        System.out.println();
//       a.printDivisorsOptimized(x);

        System.out.println(a.checkPrimeOptmized(x));

    }
}
