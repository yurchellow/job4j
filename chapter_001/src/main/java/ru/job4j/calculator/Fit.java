package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = -1;
        double manWeight = (height - 100) * 1.15;
        rsl = manWeight;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = -1;
        double womanWeight = (height - 110) * 1.15;
        rsl = womanWeight;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(100);
        System.out.println("Man 100 is " + man);
        double woman = Fit.womanWeight(110);
        System.out.println("Woman 100 is " + woman);
    }

}
