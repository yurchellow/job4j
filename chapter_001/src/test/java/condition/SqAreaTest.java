package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int k = 2;
        int p =6;
        int expected = 2;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected, out, 0.05);
    }
}
