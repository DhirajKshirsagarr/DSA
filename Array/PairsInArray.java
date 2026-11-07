package Array;
// import java.util.*;


public class  PairsInArray{
    public static void pairPrint(int arr[]){
        for(int i=0; i<arr.length ;i++){
            for(int j=i+1; j<arr.length ;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        
        }
    }

    public static void subArray(int arr[]){
        for(int i=0; i<arr.length ;i++){
            for(int j=i; j<arr.length ;j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                
                System.out.print("= "+sum);
                System.out.println();
            }
            System.out.println();
        }
    }



    public static void main(String args[]){
       int number[]={1,2,3,4,5};
        // pairPrint(number);
        subArray(number);
    
    }

}