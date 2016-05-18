package se.addq.jenkins;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int addBroken(int a, int b) {
        return a - b;
    }

    public static String burr(int a) {
        if (a % 3 == 0) {
            return "burr";
        }
        else
            return String.valueOf(a);
    }


    
}
