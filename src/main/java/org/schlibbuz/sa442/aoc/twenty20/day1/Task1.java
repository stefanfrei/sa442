/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.aoc.twenty20.day1;

import java.io.File;
import java.io.IOException;
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

        final short TARGET = 2020;

        Set<Short> numbers = FileUtils.readLines(new File("src/main/java/org/schlibbuz/sa442/aoc/twenty20/t1/input"), "ISO-8859-1")
                                .stream()
                                .map(n -> Short.parseShort(n))
                                .collect(Collectors.toSet());

        for (Short number : numbers) {
            if (numbers.contains((short)(TARGET - number))) {
                System.out.println("Factors are -> " + number + " and -> " + (TARGET - number));
                System.out.println("Result is -> " + (number * (TARGET - number) ) );
                System.exit(0);
            }
        }

        System.out.println("No Solution found :(");
    }

}
