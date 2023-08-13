import java.util.Scanner;
public class question16 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=1;i<=2*n-1;i++){
        if(i<=n){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=n-i+1;j++){
            System.out.print("* ");
        }
    }
    else{
        for(int j=1;j<=i-n;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=i-n+1;j++){
            System.out.print("* ");
        }
    }
    System.out.println();
       } 
    }
}
