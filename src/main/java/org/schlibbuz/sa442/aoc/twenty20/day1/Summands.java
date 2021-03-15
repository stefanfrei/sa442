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
enum Summands {
    TWO((byte)2), THREE((byte)3);

    private byte numVal;

    Summands(byte numVal) {
        this.numVal = numVal;
    }

    byte val() {
        return numVal;
    }
}
