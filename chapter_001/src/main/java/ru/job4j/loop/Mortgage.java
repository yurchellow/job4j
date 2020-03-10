package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double PayTime= amount + (amount * percent / 100);
        while (PayTime > 0) {
            year++;
            PayTime = (PayTime-salary)*percent / 100 + PayTime - salary;
        }
        return year;
    }
}