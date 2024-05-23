public class Main {
    public static void main(String[] args) {
        String test ="yasuoneverdie";
        Convert con = (string)-> {
            String rs = "";
            for (int i = 0; i < string.length(); i++) {
                if(i%2==0) {
                    rs+=string.toLowerCase().charAt(i);
                }else {
                    rs+=string.toUpperCase().charAt(i);
                }

            }
            return rs;

        };
         test = con.convert(test);
        System.out.println(test);

    }
}