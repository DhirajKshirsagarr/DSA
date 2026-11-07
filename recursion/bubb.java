public class bubb {
    public static void bubbl(int arr[],int iti,int ls){
        if(ls<0){
            print(arr);
            return;
        }
        if(arr[iti]>arr[iti+1] ){
            int temp=arr[iti];
            arr[iti]=arr[iti+1];
            arr[iti+1]=temp;
            print(arr);}
        if( (iti)<ls){
            // if(arr[iti]>arr[iti+1] ){
            // int temp=arr[iti];
            // arr[iti]=arr[iti+1];
            // arr[iti+1]=temp;
            // print(arr);}
            bubbl(arr, iti+1, ls);
        }else{
            iti=0;
            bubbl(arr, iti, ls-1);
        }
    }
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        bubbl(arr,0,arr.length-2);
    }
}
