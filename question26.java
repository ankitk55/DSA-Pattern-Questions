import java.util.Scanner;

public class question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       
        for(int i=n;i>=1;i--){
           int  k=1;
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
