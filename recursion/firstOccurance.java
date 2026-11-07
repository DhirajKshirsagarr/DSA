public class firstOccurance {

    public static int firstOccuranc(int[] arr,int key,int i) {
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return firstOccuranc(arr, key, i+1);
    }

    public static int lastOccuranc(int[] arr,int key , int i) {
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccuranc(arr, key, i+1);
        // isFound ka matalab o array ke i index ke aage ka bol raha hai matalab
        //  agar arr[i+1]==-1 ho and arr[i]==key ho to i ko return kar do.
        //matalab ye recursion stack mese aate wakt key ka index dhoond raha hai.
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
        
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,4,3,5,6,7,8,5,32,6};
        int key=5;

        // System.err.println(firstOccuranc(arr,key,0));
        System.err.println(lastOccuranc(arr,key,0));

    }
    
}
