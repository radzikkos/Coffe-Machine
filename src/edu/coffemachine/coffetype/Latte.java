package edu.coffemachine.coffetype;

import edu.coffemachine.items.Ingredients;

public class Latte extends Coffee {
    final int cost = 25;
    final int neededMilk = 300;
    final int neededCups = 1;
    final int neededCoffeBeans = 20;
    final int neededWater = 150;
    public Latte(){
        super(CoffeType.Latte);
        super.initCoffe(neededCoffeBeans, neededWater, neededCups, neededMilk);
    }
    @Override
    public int prepare(Ingredients ingredients) {
        return super.prepare(ingredients) != 0 ? cost : 0;
    }
}
