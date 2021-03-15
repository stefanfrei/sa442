/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.aoc.twenty20.day1;

import java.io.IOException;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Stefan
 */
public class LogicTest<T> {

    public LogicTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getResult method, of class Logic.
     * @throws java.io.IOException
     */
    @Test
    public void testGetResultTestConcrete() throws IOException {
        System.out.println("getResult");
        long expResult = 563124L;
        long result = new Logic().getResult(DataLoader.getInstance().getSetFromFile("input-test-concrete"), Summands.TWO);
        System.out.println("Result is -> " + result);
        assertEquals(expResult, result);
    }

    /**
     * Test of getResult method, of class Logic.
     * @throws java.io.IOException
     */
    @Test
    public void testGetResultProd() throws IOException {
        System.out.println("getResult");
        long expResult = 996996L;
        long result = new Logic().getResult(DataLoader.getInstance().getSetFromFile("input"), Summands.TWO);
        System.out.println("Result is -> " + result);
        assertEquals(expResult, result);
    }

}
