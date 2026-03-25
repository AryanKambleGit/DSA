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
        System.out.println(" This is Sheet 9th pattern  for  value = " + n  + " test case");

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

//        new patter1().print1();
//        new patter1().print3(5);
//        new patter1().print3plus2(9);
   //    new patter1().print6(5);
   //   new patter1().print5(5);

        int arr [] = { 4};
        for (int j = 0; j < arr.length; j++) {

//            new patter1().print2();
            new pattern1().Hourglass(arr[j]);

            new pattern1().printButterfly(arr[j]);


//            new patter1().print4ReverseInDiff1(arr[j]);
//            new patter1().print4ReverseInDiff2(arr[j]);

//           new patter1().print4Reverse(arr[j]);
//            new patter1().print4(arr[j]);
        }

    }
}
