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

    private Set<T> data;

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
     */
    @Test
    public void testGetResultTestAbstract() throws IOException {
        System.out.println("getResult");
        Logic instance = new Logic();
        String expResult = "AABB";
        long result = instance.getResult(DataLoader.getInstance().getSetFromFile("input-test-abstract"), (byte)2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class Logic.
     */
    @Test
    public void testGetResultTestConcrete() throws IOException {
        System.out.println("getResult");
        Logic instance = new Logic();
        long expResult = 563124L;
        long result = instance.getResult(DataLoader.getInstance().getSetFromFile("input-test-concrete"), (byte)2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class Logic.
     */
    @Test
    public void testGetResultProd() throws IOException {
        System.out.println("getResult");
        Logic instance = new Logic();
        long expResult = 996996L;
        long result = instance.getResult(DataLoader.getInstance().getSetFromFile("input"), (byte)2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
