/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.aoc.twenty20.day1;

import java.util.Set;

/**
 *
 * @author Stefan
 */
public class Logic {

    public Logic() {}


    Long getResult(Set<Short> data, Summands numSummands) {

        for (Short number : data) {
            if (data.contains((short)(Constants.SUM_TARGET - number))) {
                System.out.println("Factors are -> " + number + " and -> " + (Constants.SUM_TARGET - number));
                return (long)(number * (Constants.SUM_TARGET - number) );
            }
        }

        System.out.println("No Solution found :(");
        return null;
    }

    long getResult(Set<Short> data) {

        return getResult(data, Summands.TWO);
    }
}
