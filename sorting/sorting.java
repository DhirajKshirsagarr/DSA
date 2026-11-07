// package sorting;
// import java.util.*;

public class sorting{

                    //countingSort
    public static int[] countingSort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int count[]=new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j=arr.length-1;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j--;
                count[i]--;
            }
        }
        return arr;

    }

                    //bubbleSort
    public static int[] bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }


                    //insertionSort 
    public static int[] insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int j=i;

            // finding out the correct position to insert the element
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;     
    }


               //selectionSort 

    public static int[] selectionSort(int arr[]){
        int max;
        for(int i=0; i<arr.length; i++){
            max=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        return arr;
            
    }


    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,2,1,5,6,7,9,8};
        // insertionSort(arr);
        // countingSort(arr);
        // bubbleSort(arr);
        selectionSort(arr);
        printArray(arr);
        
    }





}