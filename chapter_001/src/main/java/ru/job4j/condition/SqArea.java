package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = -1;
        int h = k +1;
        h = h * 2;
        h = p / h;
        int l = h * k;
        int s = l * h;
        rsl = s;
        return rsl;
    }
    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
