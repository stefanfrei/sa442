/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442.http;

import java.util.Arrays;
import java.util.List;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Stefan
 */
public class Prober {

    private final Element e;
    private byte quality;
    private final List<String> needles = Arrays.asList(new String[] {
        "Carbohydrates",
        "Fat",
        "Protein",
        "Vitamins",
        "Minerals"
    });

    Prober(Element artifact) {
        this.e = artifact;
        quality = 0;
        this.probe();
    };

    boolean hasTitle() {
        if (e.select("caption").size() == 1) {
            quality += 20;
            return true;
        }
        return false;
    }

    boolean hasLowerSeparator() {
        if (e.select("tbody hr").size() == 1) {
            quality += 10;
            return true;
        }
        return false;
    }

    boolean hasAtLeastOneCategory() {
        if (e.select("tr b").size() >= 1) {
            quality += 10;
            return true;
        }
        return false;
    }

    boolean hasAllCategories() {    // approximative approach
        String concentrate = e.select("th b").text();
        System.out.println(concentrate);
        for (String needle : needles) {
            System.out.println(needle);
            if (!concentrate.contains(needle)) return false;
        }
        quality += 20;
        return true;
    }

    private void probe() {
        hasTitle();
        hasLowerSeparator();
        hasAtLeastOneCategory();
        hasAllCategories();
    }

    int getQuality() {
        return quality;
    }

}
