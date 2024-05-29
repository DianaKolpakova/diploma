package com.mai.tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TaxCalculatorTest {

    @Test
    public void withNds() {

        NdsResolver mock = Mockito.mock(NdsResolver.class);
        Mockito.when(mock.resolveNds()).thenReturn(0.2);

        TaxCalculator calculator = new TaxCalculator(mock);
        double withNds = calculator.withNds(100);
        Assert.assertEquals(120,withNds,0.0000001);
    }
}