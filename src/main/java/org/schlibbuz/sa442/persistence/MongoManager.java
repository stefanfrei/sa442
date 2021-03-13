/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.persistence;

/**
 *
 * @author Stefan
 */
public class MongoManager {

    public MongoManager() {};

    public static MongoConnection getConnection() {
        return MongoConnection.getInstance();
    }
}
