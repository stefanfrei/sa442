/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.schlibbuz.sa442.http.Miner;
import org.schlibbuz.sa442.reader.Integrator;
import org.schlibbuz.sa442.reader.NutriRow;
import org.schlibbuz.sa442.reader.NutriTable;

/**
 *
 * @author Stefan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        final short KCAL_TARGET = 500;
        final long EST_CONSUMERS = 300000000;
        final File NUTRIENT_FILE = new File("data/nutrient_data.csv");

        NutriTable nutriTable = NutriTable.getInstance().build(NUTRIENT_FILE);


        for (Map.Entry<Short, NutriRow> entry : nutriTable.getData().entrySet()) {
            System.out.println("  key ->" + entry.getKey());
            System.out.println("value ->" + entry.getValue());
        }
        System.exit(0);

        MongoDatabase database = MongoClients.create("mongodb://beast:27017").getDatabase("sa442");
        Miner miner = new Miner(database);

        miner.dig();

//        List<Food> foods = new ArrayList<>();
//
//        NutritionCalculator shield = new NutritionCalculator(KCAL_TARGET, EST_CONSUMERS);
//
//
//        System.out.println(shield.getEstimatedCost());


    }

    public static List<Food> loadFoods() {
        List<Food> foods = new ArrayList<>();

        foods.add(new Food("Broccoli", 200, 53, 2.5d));
        foods.add(new Food("Banana", 110, 105, 0.65d));
        foods.add(new Food("Apple", 150, 80, 0.4d));


        return foods;
    }

}
