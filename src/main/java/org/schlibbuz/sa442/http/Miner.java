/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.http;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Stefan
 */
public class Miner {

    private MongoDatabase db;


    public Miner(MongoDatabase db) {
        this.db = db;
    }

    public void dig() {
        Document doc;
        try {
            doc = Jsoup.connect("https://en.wikipedia.org/wiki/Broccoli").get();
            Element table = doc.selectFirst("table.infobox.nowrap");



            Element title = table.selectFirst("caption");

            System.out.println(title.text());

            Elements details = table.select("tbody > tr");

            for ( Element detail : details) {
                System.out.println(detail.text());
            }

            System.out.println("Artifact quality -> " + new Prober(table).getQuality());


        } catch (IOException ex) {
            Logger.getLogger(Miner.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(db.getName());
        MongoCollection<org.bson.Document> collection = db.getCollection("test");

    }

    private boolean isArtifactValuable(Element element) {
        return false;
    }







}
