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


    public void print19(int n) {
        int intS = 0;

        for (int i = 0; i < n; i++) {

            // Left stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            // Spaces
            for (int j = 0; j < intS; j++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            intS += 2;
            System.out.println();
        }

       int  space = 2 * n - 2; // IMPORTANT reset

        for (int i = 0; i < n; i++) {

            // Left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            space -= 2;
            System.out.println();
        }
    }

    public void print21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                }
                else  {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void printNestedSquare(int n) {

        int gap = 2; // for 8 → 4 square

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                // Outer boundary
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                }

                // Inner boundary (proper square)
                else if (
                        (i == gap || i == n-gap-1) && (j >= gap && j <= n-gap-1) ||
                                (j == gap || j == n-gap-1) && (i >= gap && i <= n-gap-1)
                ) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
            Alfabetic_patterns a = new Alfabetic_patterns();

            int arr [] = {  8  };
            for (int i = 0; i <= arr.length- 1;  i++) {
//                a.print14(arr[i]);
//                a.print16(arr[i]);

            //    a.print15(arr[i]);

                //hard
//                a.print17(arr[i]);
//                    a.print18(arr[i]);

//                a.print19(arr[i]);
//                    a.print21(arr[i]);

                a.printNestedSquare(arr[i]);
            }

    }

}
