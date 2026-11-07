public class binarySea {
    public static int binarySearch(int arr[],int target,int si,int ei) {
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
           return binarySearch(arr, target, si, mid-1);
        }else{
            return binarySearch(arr, target, mid+1, ei);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target =10;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
}
