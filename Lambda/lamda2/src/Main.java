public class Main {
    public static void main(String[] args) {

        Checker checker = (string) -> {
            return string.isEmpty();
        };
        String toChecked = "yasuo";
        String emptyCheck = "";
        boolean check1 = checker.check(toChecked);
        boolean check2 = checker.check(emptyCheck);
        System.out.println(check1);
        System.out.println(check2);

    }
}