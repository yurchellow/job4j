package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double payTime = amount + (amount * percent / 100);
        while (payTime > 0) {
            year++;
            payTime = (payTime - salary) * percent / 100 + payTime - salary;
        }
        return year;
    }
}