package edu.coffemachine.coffetype;


import edu.coffemachine.items.Ingredients;



public class Cappuccino extends Coffee {
    final int cost = 15;
    final int neededMilk = 200;
    final int neededCups = 1;
    final int neededCoffeBeans = 10;
    final int neededWater = 150;
    public Cappuccino(){
        super(CoffeType.Cappuccino);
        super.initCoffe(neededCoffeBeans, neededWater, neededCups, neededMilk);
    }

    @Override
    public int prepare(Ingredients ingredients) {
        return super.prepare(ingredients) != 0 ? cost : 0;
    }
}
