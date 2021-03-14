/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.aoc.twenty20.day1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Stefan
 */
public class DataLoader<T> {

    private HashMap<String, Set<T>> cache;
    private static DataLoader instance = null;
    private static final boolean USE_CACHE = false;

    private DataLoader() {
        cache = new HashMap<>();
    }

    static DataLoader getInstance() {
        if (instance == null) {
            instance = new DataLoader();
        }
        return instance;
    }

    Set<T> getSetFromFile(final String fileName) throws IOException {

        return FileUtils.readLines(
                new File(
                        new StringBuilder(Constants.FILE_PREFIX) //filename
                                .append(fileName)
                                .toString()
                ),
                Constants.CHARSET
        )
        .stream()
        .map(n -> {
            try {
                Short.parseShort(n);
                return (T)Short.valueOf(n);
            } catch(NumberFormatException e) {
                System.err.println(e.getMessage());
                return (T)n; //needed to work with abstract sample data
            }
        })
        .collect(Collectors.toSet());
    }
}
