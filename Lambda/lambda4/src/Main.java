import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        Filter f = (array)-> {
            List<Integer> even  = new ArrayList<>();
            List<Integer> odd  = new ArrayList<>();
            for (int i=0; i<array.size(); i++) {
                if(array.indexOf(i)%2==0) {
                    even.add(array.get(i));
                }else {
                    odd.add(array.get(i));
                }
            }
            System.out.println("List raw input are:" +list);
            System.out.println("List even are:" +even);
            System.out.println("List odd are:" +odd);

        };
        f.filter(list);
    }
}