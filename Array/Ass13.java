package Array;
// import java.util.*;

public class Ass13{
    public static boolean Q1(int arr[]){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    } 

    public static int Q3(int arr[]){
        int profit=0;
        int buy=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<buy){
                buy=arr[i];
            }else{
                profit=Math.max(profit, arr[i]-buy);
            }
        
        }
        return profit;
    }


    public static void main(String args[]){
        int arr[] = {7,1,5,3,6,4};
        System.out.println(Q3(arr));
        //System.out.println(Q1(arr));
    }

}