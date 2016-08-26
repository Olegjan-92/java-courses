package ru.ponomarev.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oleg on 12.07.16.
 */
public class CalculatorsumTest {
    @Test
    public void testadd() throws Exception {
        Calculatorsum calculatorsum = new Calculatorsum();
        calculatorsum.add(1,1);
        assertEquals(2, calculatorsum.getResult());
    }
    @Test (expected = UserException.class)
    public void divException() throws UserException {
        Calculatorsum calculatorsum = new Calculatorsum();
        calculatorsum.div();
    }

    @Test ()
    public void div() throws UserException {
        Calculatorsum calculatorsum = new Calculatorsum();
        calculatorsum.div(1,1);
        assertEquals(1, calculatorsum.getResult());
    }

    @Test (expected = IllegalArgumentException.class)
    public void divRuntimeException() throws UserException {
        Calculatorsum calculatorsum = new Calculatorsum();
        calculatorsum.div(1,0);
    }

}