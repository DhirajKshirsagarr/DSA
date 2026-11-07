import java.util.ArrayList;

public class maximum {
    static int max(ArrayList<Integer> list){
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            maxx=Math.max(maxx,list.get(i));
        }
        return maxx;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(11);
        list.add(5);
        list.add(6);

        System.out.println(max(list));
    }
}