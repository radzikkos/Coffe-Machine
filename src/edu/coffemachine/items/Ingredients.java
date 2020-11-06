package edu.coffemachine.items;


import java.util.HashMap;

import java.util.Map;

public class Ingredients {
    Map<ItemType, Item> ingredients;
    public Ingredients(int coffeBeansAmount, int cupsAmount, int milkAmount, int waterAmount){
        initIngredients(coffeBeansAmount, cupsAmount, milkAmount, waterAmount);
    }
    void initIngredients(int coffeBeansAmount, int cupsAmount, int milkAmount, int waterAmount){
        ingredients = new HashMap<>();
        ingredients.put(ItemType.Milk, new Milk(milkAmount));
        ingredients.put(ItemType.Water, new Water(waterAmount));
        ingredients.put(ItemType.CoffeBeans, new CoffeBeans(coffeBeansAmount));
        ingredients.put(ItemType.Cups, new Cups(cupsAmount));
    }
    public Map<ItemType, Item> getIngredients(){
        return ingredients;
    }
    public void fill(){
        for(var ingredient : ingredients.entrySet()){
            ingredient.getValue().restore();
        }
    }
    public void remaining(){
        for(var ingredient : ingredients.entrySet()){
            ingredient.getValue().showActualAmount();
        }
    }
}
