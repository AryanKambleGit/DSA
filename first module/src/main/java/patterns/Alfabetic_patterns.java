package patterns;


public class Alfabetic_patterns {

    //A
    //AB
    //ABC
    //ABCD
    //ABCDE
    //ABCDEF
    public void print14(int n) {
        System.out.println(" This is Sheet 14th pattern  for  value = " + n  + " test case");


        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    //ABCDEF
    //ABCDE
    //ABCD
    //ABC
    //AB
    //A
    public void print15(int n) {

        for (int i = n; i >= 0; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }


    //A
    //BB
    //CCC
    //DDDD
    //EEEEE
    //FFFFFF
    public  void print16(int n) {
        System.out.println(" This is Sheet 16 pattern  for  value = " + n  + " test case");

        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);

            }
            ch++;
            System.out.println();
        }
    }


    //
    public  void print17(int n) {
        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';

            int breakpoint = (2 * i + 1) / 2;

            // characters
            for (int j = 0; j < 2 * i + 1; j++) {

                System.out.print(ch);

                if (j < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            System.out.println();
        }
    }


    public void print18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A' + n - 1 - i); ch <= (char) ('A' + n - 1); ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
            Alfabetic_patterns a = new Alfabetic_patterns();

            int arr [] = { 6   };
            for (int i = 0; i <= arr.length- 1;  i++) {
//                a.print14(arr[i]);
//                a.print16(arr[i]);

            //    a.print15(arr[i]);

                //hard
//                a.print17(arr[i]);
                    a.print18(arr[i]);

            }

    }

}
