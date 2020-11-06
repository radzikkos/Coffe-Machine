package edu.coffemachine.coffetype;

import edu.coffemachine.items.Ingredients;
import edu.coffemachine.items.ItemType;

import java.util.HashMap;
import java.util.Map;

abstract public class Coffee implements Prepare {
    Map<ItemType, Integer> neededAmountOfIngredients;
    CoffeType coffeType;
    Coffee(CoffeType coffeType){
        this.coffeType = coffeType;
        neededAmountOfIngredients = new HashMap<>();
    }

    public boolean checkIfIsPossibleToPrepare(Ingredients ingredients){
        int neededamount = 0;
        for(var ingredient : ingredients.getIngredients().entrySet()){
            neededamount = neededAmountOfIngredients.get(ingredient.getKey());
            if(!ingredient.getValue().checkIfItsAbleToBeUsedWithThisValue(neededamount)){
                /*Used decreaseAmount to write on the screen what is lack of*/
                ingredient.getValue().decreaseAmount(neededamount);
                return false;
            }
        }
        return true;

    }
    public int prepare(Ingredients ingredients){
        if(!checkIfIsPossibleToPrepare(ingredients)){
            System.out.println("Don't have enough ingredients");
            return 0;
        }
        int neededamount = 0;
        for(var ingredient : ingredients.getIngredients().entrySet()){
            neededamount = neededAmountOfIngredients.get(ingredient.getKey());
            ingredient.getValue().decreaseAmount(neededamount);
        }
        System.out.println("Here you are! Your " + coffeType);
        return 1;
    }

    void initCoffe(int neededCoffeBeans, int neededWater, int neededCups, int neededMilk){
        neededAmountOfIngredients.put(ItemType.CoffeBeans, neededCoffeBeans);
        neededAmountOfIngredients.put(ItemType.Water, neededWater);
        neededAmountOfIngredients.put(ItemType.Cups, neededCups);
        neededAmountOfIngredients.put(ItemType.Milk, neededMilk);
    }
}
