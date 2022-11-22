public class FunctionalInterfaces {
    public static void main(String[] args) {
      chekDivideBy13();
      selection();
    }
    public static void chekDivideBy13(){
        DivideBy13<Integer> res = y -> y % 13 == 0;
        System.out.println("26 делится на 13 без остатка: " + res.itsTrue(26));
        System.out.println("27 делится на 13 без остатка: " + res.itsTrue(27));
    }
    public static void selection(){
        LineSelection<String> stringWithMaxLength = (s1, s2) -> {
            if (s2.length() > s1.length()) {
                return s2;
            } else if (s2.length() < s1.length()){
                return s1;
            }
            else {
                return "строки равной длины";
            }
        };
        System.out.println(stringWithMaxLength.apply("12345", "6789"));
    }
}

