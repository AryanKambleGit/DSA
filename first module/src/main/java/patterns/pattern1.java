package patterns;

public class pattern1 {

    // ---------------- BASIC PATTERNS ----------------

    private void print1(){
        System.out.println("First pattern ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void print2(){
        System.out.println("Second pattern ");
    String x = "a" ;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x);
            }
            System.out.println();
        }

    }

    // sheet 3rd pattern
    public void print3(int n){

        System.out.println("sheet 3rd pattern ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // ---------------- NUMBER PATTERNS ----------------

    // sheet 4th pattern
    public void print4(int n){

        System.out.println("sheet 4th pattern ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void print4Reverse(int n){
        System.out.println("sheet 4th reverse pattern ");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    // 11111
    // 2222
    // 333
    // 44
    // 5
    public void print4ReverseInDiff1(int n){
        System.out.println("sheet 4th reverse pattern ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n  - i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //      12345
     //     1234
     //     123
     //     12
     //     1
    public void print4ReverseInDiff2(int n){
        System.out.println("sheet 4th reverse pattern ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n  - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
 // sheet 6th pattern
    public void print6(int n){
        System.out.println("sheet 6th pattern ");
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // ---------------- PYRAMID PATTERNS ----------------

    //     *
    //     ***
    //    *****
    //   *******
    //  *********
    public void print7(int n){
//        System.out.println("sheet 7 th pattern ");
        System.out.println(" This is Sheet 7th pattern  for  value = " + n  + " test case");
        for (int i = 0; i <= n; i++) {
            //Space
            for (int j = 0; j <= n - i - 1 ; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //***********
    // *********
    //  *******
    //   *****
    //    ***
    //     *
    public void print8(int n){
        System.out.println(" This is Sheet 8th pattern  for  value = " + n  + " test case");

        for (int i = n ; i >= 0; i--) {
            for (int j = 0; j < n-  i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-  i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    //          *
    //        * * *
    //      * * * * *
    //    * * * * * * *
    //  * * * * * * * * *
    //* * * * * * * * * * *
    //  * * * * * * * * *
    //    * * * * * * *
    //      * * * * *
    //        * * *
    //          *
    public void print9(int n){

        System.out.println(" This is Sheet 9th pattern  for  value = " + n  + " test case");
        for (int i = 0; i <= n; i++) {
            //Space
            for (int j = 0; j <= n - i - 1 ; j++) {
                System.out.print("  ");
            }
            //star
            for (int j = 0; j < 2*i + 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1 ; i >= 0; i--) {
            for (int j = 0; j < n-  i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < n-  i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }

    }




    public void  print10(int n){
        for (int i = 0; i <= 2*n- 1 ; i++) {
            int stars = i ;

            if (i > n )   stars = 2*n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void print11(int n){
        int start = 1 ;

        for (int i = 0; i <= n; i++) {

            if (i  % 2 == 0 ) start =  1 ;
            else start = 0 ;

            for (int j = 0 ; j <= i ; j++) {
                System.out.print(start + " " );
                start = 1 - start ;

            }
            System.out.println();
        }
    }

 public  void print12(int n){

 }



    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14 15
    public  void print13(int n){
        int x = 1 ;

        for (int i = 1; i <= n; i++) {


          for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++ ;

            }

            System.out.println();
        }
    }
    //2
    //4 6
    //8 10 12
    //14 16 18 20
    public  void print13Eventriangle(int n, int x ){

             for (int i = 1; i < n; i++) {
                    for(int j = 1; j <= i; j++) {
                        System.out.print(x + " " );
                        x = x + 2;
                    }
                 System.out.println();
             }
    }

    // ---------------- PRACTICE PATTERNS ----------------



    //* * * * * * * * * Hourglass
    //  * * * * * * *
    //    * * * * *
    //      * * *
    //        *
    //      * * *
    //    * * * * *
    //  * * * * * * *
    //* * * * * * * * *
    public void Hourglass(int n){
        System.out.println(" This is Sheet hourglass pattern  for  value = " + n  + " test case");

        for (int i = n ; i >= 0; i--) {
            for (int j = 0; j < n-  i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < n-  i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            //Space
            for (int j = 0; j < n - i  ; j++) {
                System.out.print("  ");
            }
            //star
            for (int j = 0; j < 2*i + 1 ; j++) {
                System.out.print("* ");
            }
            //Space
            for (int j = 0; j <= n - i  ; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }


    }

    public void printButterfly(int n){

        System.out.println("Butterfly Pattern for n = " + n);

        // Upper part
        for(int i = 1; i <= n; i++){

            // left stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            // spaces
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }

            // right stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part
        for(int i = n; i >= 1; i--){

            // left stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            // spaces
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }

            // right stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {

        pattern1 p = new pattern1();

        int arr[] = {5};

        for (int j = 0; j < arr.length; j++) {

            // ---------------- BASIC PATTERNS ----------------

            // p.print1();
            // p.print2();
            // p.print3(arr[j]);

            // p.print4(arr[j]);
            // p.print4Reverse(arr[j]);
            // p.print4ReverseInDiff1(arr[j]);
            // p.print4ReverseInDiff2(arr[j]);

            // p.print6(arr[j]);

            // p.print7(arr[j]);
            // p.print8(arr[j]);
            // p.print9(arr[j]);

         //   p.print10(arr[j]);
            // p.print11(arr[j]);
            // p.print12(arr[j]);



            // p.print13(arr[j]);   // Today learned
            // p.print13Eventriangle(arr[j], 20);

            // ---------------- PRACTICE PATTERNS ----------------

             p.Hourglass(arr[j]);
            // p.printButterfly(arr[j]);

        }
    }
}
