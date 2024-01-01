import java.util.*;

public class pattern_2 {

    public  static void abc_same_col(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                // A+1,2,3,...
                char ch = (char) ('A' + j - 1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }

//            ABCDE
//            ABCD
//            ABC
//            AB
//            A
    public  static void reverse_abc(int n){

        for(int i=n;i>=1 ;i--){
            for(int j=1;j<=i;j++){
                // A+1,2,3,...
                char ch = (char) ('A'+j-1);
                System.out.print(ch);

            }
            System.out.println();
        }
    }
//             A
//            ABA
//           ABCBA
//           ABCDCBA
//          ABCDEDCBA

    public  static void abc_pyramid(int n){

        for(int i=1;i<=n;i++){

          for(int j=1;j<=n-i;j++){
              System.out.print(" ");
          }
            for(int j=1;j<=i;j++){
                // A+1,2,3,...
                char ch = (char) ('A' + j - 1);
                System.out.print(ch);
            }
            for(int j=1;j<=i-1;j++){
                char ch = (char)('A'+ i-j-1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter no. of rows");
        int n= sc.nextInt();
      //  abc_same_col(n)
        //  reverse_abc(n);
        abc_pyramid(n);
    }
}
