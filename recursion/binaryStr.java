public class binaryStr {
    public static void binaryStrr(int n,String str,int ls){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryStrr(n-1, str+"0", 0);
        if(ls==0){
            binaryStrr(n-1, str+"1", 1);
        }
    }
    // public static void binaryStrrr(int n,StringBuilder str,int ls){
    //     if(n==0){
    //         System.out.println(str);
    //         return;
    //     }
    //     binaryStrrr(n-1, str.append("0"), 0);
    //     if(ls==0){
    //         str.pop;
    //         binaryStrrr(n-1, str.append("1"), 1);
    //     }
    // }
    public static void main(String[] args) {
        binaryStrr(3,"",0);
    }
}
