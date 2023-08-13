import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1 ||i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*\t");
                }
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j==1||j==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print(" \t");
                    }
                }
            }
            System.out.println();
        }
    }
}
