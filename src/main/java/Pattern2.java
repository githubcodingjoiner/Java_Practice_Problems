import java.util.Scanner;
public class Pattern2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows");
        int n = sc.nextInt();
//        // Increasing Star pattern
//        for (int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // Decreasing star pattern
//        for (int i=0;i<n;i++){
//            for(int j=n-1;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
        for (int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int k = 1;k<=(2*i-1);k++){
                System.out.print("*");
            }           
            System.out.println();
        }


sc.close();
    }
}
