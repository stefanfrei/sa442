/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stefan
 */

enum MealType {
  FULL,
  VEGI,
  VEGAN
}

public class NutritionCalculator implements Calculator {

    private short targetKcalPerDay;
    private long numConsumers;
    private long estimatedCost;


    private List<Food> foods;

    public NutritionCalculator(short targetKcalPerDay, long numConsumers) {
        this.targetKcalPerDay = targetKcalPerDay;
        this.numConsumers = numConsumers;

        foods = new ArrayList<>();
    }

    public void createMeal() {
        createMeal(MealType.FULL);
    }

    public void createMeal(MealType mealType) {

    }


    public void addFood(Food food) {
        foods.add(food);
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public void clearFoods() {
        foods = new ArrayList<>();
    }

    public short getTargetKcalPerDay() {
        return targetKcalPerDay;
    }

    public void setTargetKcalPerDay(short targetKcalPerDay) {
        this.targetKcalPerDay = targetKcalPerDay;
    }

    public long getNumConsumers() {
        return numConsumers;
    }

    public void setNumConsumers(long numConsumers) {
        this.numConsumers = numConsumers;
    }

    public long getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(long estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

}
