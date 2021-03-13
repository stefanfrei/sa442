/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.reader;

import com.mongodb.client.MongoDatabase;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Stefan
 */
public final class NutriTable {

    private static NutriTable instance = null;

    private final List<String> header;
    private final Map<Short, NutriRow> data;

    private NutriTable() throws IOException {
        this.header = new LinkedList<>();
        this.data = new LinkedHashMap<>();
    }

    public static NutriTable getInstance() throws IOException {
        if (instance == null) {
            instance = new NutriTable();
        }
        return instance;
    }

    public NutriTable build(File src) throws IOException {
        return instance;
    }

    public NutriTable build(MongoDatabase db) {
        return instance;
    }

    public NutriTable build(java.sql.Connection conn) {
        return instance;
    }

    public List<String> getHeader() {
        return header;
    }

    public Map<Short, NutriRow> getData() {
        return data;
    }

}
