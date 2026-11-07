import java.util.*;
public class traversing {
    public static void print(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.err.print(list.get(i)+" ");
        }
        System.out.println();
    }
    public static void reverce(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            System.err.print(list.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        print(list);
        reverce(list);
    }
}