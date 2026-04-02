package Collection.List;

import java.util.List;
import java.util.ArrayList;


public class ArrayListLearn{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();


        list.add(1);
        list.add(2);
       list.remove( Integer.valueOf(1));
       list.remove(Integer.valueOf(2));
       list.add(3);

       list2.addAll(list);

       list.clear();
       

        System.out.println( "list 2 = " +  list2);
        System.out.println("list 1 = " + list);




    }
}
