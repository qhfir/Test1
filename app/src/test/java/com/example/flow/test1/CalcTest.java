package com.example.flow.test1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by flow on 2017/7/7.
 */
public class CalcTest {

    private Calc calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calc();
    }

    @Test
    public void sum() throws Exception {
        assertEquals(6d, calc.sum(1d, 5d), 0d);
    }

    @Test
    public void substract() throws Exception {
        assertEquals(6d, calc.substract(8d, 2d), 0d);
    }

    @Test
    public void divide() throws Exception {
        assertEquals(2d, calc.divide(4d, 2d), 0d);
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(3d, calc.multiply(1d, 3d), 0d);
    }

}