import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list2 = new ArrayList<String>();
        list2.add("Nguyen Van B");
        list2.add("Pham Thanh Thao");
        list2.add("Dinh Thu Van");
        list2.add("Tran Hoang C");
        for (String s : list2){
            System.out.println(s);
        }
        System.out.println("Sau khi sort");
        sortAlphabet sort = (List<String> ls)->{


            Collections.sort(ls, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }


            });

return ls;

        };
    List<String> rs = sort.sortAlphabet(list2);
    for(String u : rs){
        System.out.println(u);
    }


    }
}