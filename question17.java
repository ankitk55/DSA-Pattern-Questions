import java.util.Scanner;
public class question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
        if(i<=n/2+1){
            for(int j=1;j<=n/2-i+1;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" \t");
            }
             for(int j=1;j<=n/2-i+1;j++){
                System.out.print("*\t");
            }
        } 
        else{
            for(int j=1;j<=(i-n/2)-1;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=(2*(n-i))+1;j++){
                System.out.print(" \t");
            }
            for(int j=1;j<=(i-n/2)-1;j++){
                System.out.print("*\t");
            }
        }
        System.out.println();
        }
    }
    
}
