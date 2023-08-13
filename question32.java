import java.util.Scanner;

public class question32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=1;j<=2*i-1;j++){
                    if(j%2==0){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print(i+"\t");
                    }
                }
            }else{
                for(int j=1;j<=2*((2*n-1)-i)+1;j++){
                    if(j%2==0){
                        System.out.print("*\t");
                    }else{
                        System.out.print((2*n-1)-i+1 +"\t");
                    }
                }
            }
            System.out.println();
        }

    }
}
