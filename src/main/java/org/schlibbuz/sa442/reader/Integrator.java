/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.reader;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Stefan
 */
public final class Integrator {

    private final NutriTable nutriTable;
    private final File nutriFile;

    public Integrator(String path) throws IOException {
        nutriTable = new NutriTable(
                FileUtils.readLines(new File(path), "utf8")
        );
        lines = ;
        data = new LinkedHashMap<>();
    }

    public final Integrator check() {
        int refLength = 0;
        int i = 0;
        for (String line : lines) {
            String parts[] = line.split("#");

            if (refLength == 0) refLength = parts.length; //init ref

            if (parts.length != refLength) {
                System.out.println(line);
                System.out.println("Integrity failed");
                System.exit(0);
            }

            if (i++ > 0) data.put(parts[0], line); // first line is table-header
        }
        System.out.println("Integrity passed with refLength -> " + refLength + ", " + lines.size() + " lines parsed!");
        return this;
    }


    public final NutriTable getNutriTable() {
        return data;
    }
}
