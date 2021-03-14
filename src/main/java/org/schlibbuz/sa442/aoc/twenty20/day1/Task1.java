/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.aoc.twenty20.day1;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Stefan
 */
public class Task1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        boolean solutionFound = false;


        Set<Short> data = DataLoader.getInstance().getSetFromFile("input");


        for (Short number : data) {
            if (data.contains((short)(Constants.SUM_TARGET - number))) {
                System.out.println("Factors are -> " + number + " and -> " + (Constants.SUM_TARGET - number));
                System.out.println("Result is -> " + (number * (Constants.SUM_TARGET - number) ) );
                solutionFound = true;
                break;
            }
        }
        if (solutionFound == false) {
            System.out.println("No Solution found :(");
        }
    }

}
