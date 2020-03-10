/**
 * Package for calculate task
 *
 * @author Yuriy Nikitin (onkelyura@gmail.com)
 * @version $Id$
 * @since 0.1
 */
package ru.job4j.calculator;

public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    /**
     * Конструктор.
     * @param args
     */
    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}
