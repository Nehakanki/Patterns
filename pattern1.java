import java.util.*;
public class pattern1 {
    // ****
    //****
    //****
    //****
    public  static void print_same_no(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
//
//          *
//          **
//          ***
//          ****


    public static void same_row(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 1
    // 12
    // 123
    // 1234
    public static void same_row_no(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

//
//          1
//          22
//          333
//          4444

    public static void same_col_no(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


//                        *
//                      * * *
//                     * * * * *
//                    * * * * * * *
//                  * * * * * * * * *
//


    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("* ");
            }

            System.out.println();
        }


    }

    public static void reverse_pyaramid(int n){
        for(int i=1;i<=n;i++){

            //print space
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=n+1-i;j>=1;j--){
                System.out.print("* ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void mirror_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for(int i=1;i<=n;i++){

            //print space
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=n+1-i;j>=1;j--){
                System.out.print("* ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print("* ");
            }

            System.out.println();
        }


    }
   public static void  binary_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(((i%2==0) && (j%2==0)) || ((i%2!=0) && (j%2!=0)) ){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
   }
//           1             1
//           1 2         2 1
//           1 2 3     3 2 1
//           1 2 3 4 4 3 2 1
//    print num + space+space+ num

    public static void v_num(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");

            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");

            }


            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

//            1
//            23
//            456
//            78910

    public static void num_incr(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
//        print_same_no(n);
//        same_row(n);
//        same_row_no(n);
//        same_col_no(n);
//        pyramid(n);
//        reverse_pyaramid(n);
//        mirror_pyramid(n);
//        binary_pattern(n);
        //v_num(n);
        num_incr(n);



    }
}
