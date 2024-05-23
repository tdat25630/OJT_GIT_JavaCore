import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list2 = new ArrayList<>();
        list2.add(11.0);
        list2.add(12.0);
        list2.add(33.0);
        list2.add(44.0);
        list2.add(55.0);
        list2.add(66.0);
        list2.add(77.0);
        list2.add(1.0);

        avgCalculate cal = (List<Double> ls)->{
            double count = 0;
            double sum = 0;
            for (Double o : ls){
                count++;
                sum += o;
            }
            return sum/count;
        };
        double rs = cal.avgCal(list2);
        System.out.println(rs);
    }
}