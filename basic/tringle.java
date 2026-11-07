import java.util.*;

public class tringle{
    public static void Tringle(int n){
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();}
               
            for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();}
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        Tringle(n);
        sc.close();
    }
}