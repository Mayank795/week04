package com.generics.personalizedmealplangenerator;
class Meal<T extends MealPlan> {
    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public void generateMealPlan() {
        meal.displayMeal();
    }
}


