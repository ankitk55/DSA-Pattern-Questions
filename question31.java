import java.util.Scanner;

public class question31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            int k=n;
            for(int j=1;j<=n;j++){
                if(j==i){
                    System.out.print("*\t");
                }else{
                    System.out.print(k +"\t");
                }
                k--;
            }
            System.out.println();
        }
    }
}
