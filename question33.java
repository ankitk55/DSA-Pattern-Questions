import java.util.Scanner;

public class question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            int k=i-1;
            for(int j=1;j<=i-1;j++){
                System.out.print(" \t");
            }
            if(i==n){
                System.out.print("0\t");
            }else{
               for(int j=1;j<=n-i;j++){
                System.out.print(++k+"\t");
               } 
               System.out.print("0\t");
                for(int j=1;j<=n-i;j++){
                System.out.print(k-- +"\t");
               } 
            }
            System.out.println();
        }
    }
}
