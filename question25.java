import java.util.Scanner;

public class question25 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print(" \t");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print((k++) +"\t");
                
            }
            System.out.println();
        }
    }
}
