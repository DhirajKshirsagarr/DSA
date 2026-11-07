import java.util.ArrayList; //or java .util.*;
public class intro{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();  //here list is name or vairable name 
        //"<>" in bracket me ham class pass karate hai jaise Integer , Boolean ,Float,Double ,String, etc..

        //element add karane ke liye .add(ele)  TC=O(1);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);

        // for add element at index : .add(idx,ele); TC=O(n)
        list.add(3,25);
        System.out.println(list);

        // get Operation : .get(index) TC=O(1);
        int ele=list.get(3);
        System.out.println(ele);

        //remove or delete : .remove(index); TC=O(n) because search time 
        list.remove(2);
        System.out.println(list);

        //Set element at index : .set(index , element); TC=O(n);
        list.set(3,10);
        System.out.println(list);

        //checking element exist or not : .contains(element); TC=O(n);

        System.out.println(list.contains(10));

        // checking size : .size(); TC=O(1) same as a arr.length TC=O(1)
        System.out.println(list.size());
    }
}