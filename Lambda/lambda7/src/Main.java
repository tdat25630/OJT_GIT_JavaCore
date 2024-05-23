import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);

       Filter filter = ( List<Integer> list2)->{
           Set<Integer> rs = new HashSet<>(list2);
           return new ArrayList<> (rs);
       };

       List<Integer> list3 = filter.filter(list);
       for (Integer o: list3){
           System.out.println(o);
       }


    }
}