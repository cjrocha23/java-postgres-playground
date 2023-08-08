package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilTest {
    @Test
    void testMdcProp01Imp() {
        int a = 6, b = 3;
        int esperado = 3;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcProp01Par() {
        int a = 6, b = 2;
        int esperado = 2;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcProp03Neg() {
        int a = -6, b = 0;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcProp03Pos() {
        int a = 6, b = 0;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcProp06Cre() {
        int a = 2, b = 6;
        int esperado = MathUtil.mdc(b, a);
        int obtido = MathUtil.mdc(a, b);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcProp06Dec() {
        int a = 6, b = 2;
        int esperado = MathUtil.mdc(b, a);
        int obtido = MathUtil.mdc(a, b);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcProp07 () {
        int a = 6, b = 2;
        int esperado = MathUtil.mdc(-a, b);
        int obtido = MathUtil.mdc(-a, -b);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcProp08Pos () {
        int a = 6;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, a);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcProp08Neg () {
        int a = -6;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, a);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcProp12Prix2 () {
        int b = 7, a = b;
        int esperado = b;
        int obtido = MathUtil.mdc(b, a);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcProp12Prix1 () {
        int b = 7, a = 2;
        int esperado = 1;
        int obtido = MathUtil.mdc(b, a);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcCasoGeral () {
        int a = 30, b = 12;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(obtido, esperado);
    }

    @Test
    void testMdcProp04 () {
        int m = 2, a = 6, b = 3;
        int esperado = MathUtil.mdc(m * a, m * b);
        int obtido = m * MathUtil.mdc(a, b);
        assertEquals(obtido, esperado);
    }

}
