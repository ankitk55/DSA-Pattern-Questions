import java.util.Scanner;

public class question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print(" \t");
            }
            if(i!=n){
                 for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
        }
            else{
               for(int j=1;j<=n-1;j++){
                System.out.print("*\t");  
            }
         
        }
        System.out.println();
       }
}
}
