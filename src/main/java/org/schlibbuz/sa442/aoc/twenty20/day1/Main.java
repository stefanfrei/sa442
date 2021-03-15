/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.aoc.twenty20.day1;

import java.io.IOException;
import java.util.Set;


/**
 *
 * @author Stefan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        task1();
        task2();

    }

    static void task1() {

        try {
            Set<Short> data = DataLoader.getInstance().getSetFromFile("input");
            System.out.println("Result is -> " + new Logic().getResult(data));

        } catch(IOException e) {
            System.err.println(e.getMessage());
            System.err.println("Is the input file missing?");
        }

    }

    static void task2() {

        try {
            Set<Short> data = DataLoader.getInstance().getSetFromFile("input");
            System.out.println("Result is -> " + new Logic().getResult(data, Constants.SUMMANDS.THREE.getNumVal()));

        } catch(IOException e) {
            System.err.println(e.getMessage());
            System.err.println("Is the input file missing?");
        }

    }

}