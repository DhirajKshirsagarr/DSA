// package sorting;
public class mergee {
    public static void meargeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        meargeSort(arr, si, mid);
        meargeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
        }

        public static void merge(int arr[],int si,int mid,int ei){
            int temp[]=new int[ei-si+1];
            int i=si;
            int j=mid+1;
            int k=0;

            while(i<=mid && j<=ei){
                if(arr[i]>arr[j]){
                    temp[k]=arr[i];
                    i++;
                }else{
                    temp[k]=arr[j];
                    j++;
                }
                k++;

            }
            while(i<=mid){
                temp[k++]=arr[i++];
            }
            while(j<=ei){
                temp[k++]=arr[j++];
            }

            for( i=si,j=0;i<=ei;i++,j++){
                arr[i]=temp[j];
            }
            
            
        }

        public static void print(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    public static void main(String[] args) {
        int arr[]={1,5,6,3,2,737,7,885,4,35,6,383,4,545,87};    
        meargeSort(arr,0,arr.length-1);
         print(arr);
       
    }
}
