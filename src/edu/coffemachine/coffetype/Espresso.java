package edu.coffemachine.coffetype;

import edu.coffemachine.items.Ingredients;

public class Espresso extends Coffee {
    final int cost = 35;
    final int neededMilk = 0;
    final int neededCups = 1;
    final int neededCoffeBeans = 40;
    final int neededWater = 40;
    public Espresso(){
        super(CoffeType.Espresso);
        super.initCoffe(neededCoffeBeans, neededWater, neededCups, neededMilk);
    }
    @Override
    public int prepare(Ingredients ingredients) {
        return super.prepare(ingredients) != 0 ? cost : 0;
    }
}
