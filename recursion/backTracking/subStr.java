public class subStr {
    public static void printSubStr(String str,String newStr,int idx){
        if(idx==str.length()){
            
            if(newStr.length()==0){
                System.out.println("null");
            }else{
                System.out.println(newStr);
            }
            return;
        }
        //for yes
        printSubStr(str, newStr+str.charAt(idx), idx+1);
        // for no
        printSubStr(str, newStr, idx+1);
    }
    public static void main(String[] args) {
        String str="abc";
        printSubStr(str,"",0);
    }
}
