public class douplicate {
    public static void removeDouplicates(String str,boolean arr[],int i,StringBuilder newStr){
        if(i==str.length()){
            System.out.print(newStr);
            return;
        }
        if(arr[str.charAt(i)-'a']==false){
            newStr.append(str.charAt(i));
            arr[str.charAt(i)-'a']=true;
            removeDouplicates(str, arr, i+1, newStr);
        }else{
            removeDouplicates(str, arr, i+1, newStr);
        }

    }
    public static void main(String[] args) {
        String str="anbbbccccddddaxyzjjjak";
        boolean arr[]=new boolean[26];
        StringBuilder newStr=new StringBuilder("");
        removeDouplicates(str,arr,0,newStr);
    }
}
