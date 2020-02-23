package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = -1;
        int x1x2 = x1 - x2;
        int y2y1 = y2 - y1;
        x1x2 = x1x2*x1x2;
        y2y1 = y2y1 * y2y1;
        int d = x1x2 + y2y1;
        rsl = Math.sqrt(d);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}