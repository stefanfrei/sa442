/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.aoc.twenty20.day1;

/**
 *
 * @author Stefan
 */
public class SameValueException extends Exception {

    /**
     * Creates a new instance of <code>SameValueException</code> without detail
     * message.
     */
    public SameValueException() {
    }

    /**
     * Constructs an instance of <code>SameValueException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public SameValueException(String msg) {
        super(msg);
    }
}
