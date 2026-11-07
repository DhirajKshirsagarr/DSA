public class linSearch {
    public static int linearSearch(int arr[],int target,int idx) {
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }else{
            return linearSearch(arr, target, idx+1);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,3,2,3,4,992,5,6,7,9,10};
        int target =10;
        System.out.println(linearSearch(arr,target,0));
    }
}
