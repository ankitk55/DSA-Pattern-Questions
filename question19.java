import java.util.Scanner;

public class question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
            }else{
                if(i<=n/2+1){
                    for(int j=1;j<=n/2-i+2;j++){
                        System.out.print("* ");
                    }
                    for(int j=1;j<=2*i-3;j++){
                        System.out.print("  ");
                    }
                     for(int j=1;j<=n/2-i+2;j++){
                        System.out.print("* ");
                    }
                }
                else{
                    for(int j=1;j<=i-n/2;j++){
                        System.out.print("* ");
                    }
                    for(int j=1;j<=2*(n-i)-1;j++){
                        System.out.print("  ");
                    }
                     for(int j=1;j<=i-n/2;j++){
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
