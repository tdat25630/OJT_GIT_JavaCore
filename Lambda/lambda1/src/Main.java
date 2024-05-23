public class Main {
    public static void main(String[] args) {
        Sum2Num sum = (a,b) -> {
            return a+b;
        };
        int rs = sum.sum2Num(3,5);
        System.out.println(rs);
    }
}