package com.generics.personalizedmealplangenerator;

public class Main {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = MealPlanGenerator.createMealPlan(new VegetarianMeal());
        vegetarianMeal.generateMealPlan();

        Meal<VeganMeal> veganMeal = MealPlanGenerator.createMealPlan(new VeganMeal());
        veganMeal.generateMealPlan();

        Meal<KetoMeal> ketoMeal = MealPlanGenerator.createMealPlan(new KetoMeal());
        ketoMeal.generateMealPlan();

        Meal<HighProteinMeal> highProteinMeal = MealPlanGenerator.createMealPlan(new HighProteinMeal());
        highProteinMeal.generateMealPlan();
    }
}
