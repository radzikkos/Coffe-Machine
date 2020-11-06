package edu.coffemachine;

import edu.coffemachine.coffetype.*;
import edu.coffemachine.items.Ingredients;
import edu.coffemachine.items.Money;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main Class where every actions happen
 */
public class CoffeeMachine {
    private Ingredients ingredients;
    private Money money;
    private Map<CoffeType, Coffee> coffees;
    CoffeeMachine(){
        machineInit();
    }
    void machineInit(){
        coffees = new HashMap<>();
        coffees.put(CoffeType.Cappuccino, new Cappuccino());
        coffees.put(CoffeType.Latte, new Latte());
        coffees.put(CoffeType.Espresso, new Espresso());

        money = new Money(0);
    }
    void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many coffe beans does machine have ? -> ");
        int coffeBeans = scanner.nextInt();
        System.out.print("How many cups does machine have ? -> ");
        int cups = scanner.nextInt();
        System.out.print("How much milk does machine ? -> ");
        int milk = scanner.nextInt();
        System.out.print("How much water has machine ? -> ");
        int water = scanner.nextInt();
        ingredients = new Ingredients(coffeBeans, cups, milk, water);
    }
    void run(){
        while(chooseAnAction()) {

        }
    }
    boolean chooseAnAction(){
        System.out.println("Write an action (buy, fill, take, remaining, exit): ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()){
            case "buy":{
                buy();
                break;
            }
            case "fill":{
                fill();
                break;
            }
            case "remaining":{
                remaining();
                break;
            }
            case "take":{
                take();
                break;
            }
            case "exit":{
                return false;
            }
            default:{
                System.out.println("Don't understand");
            }
        }
        return true;
    }
    void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()){
            case "1":{
                money.addAmount(coffees.get(CoffeType.Espresso).prepare(ingredients));
                break;
            }
            case "2":{
                money.addAmount(coffees.get(CoffeType.Latte).prepare(ingredients));
                break;
            }
            case "3":{
                money.addAmount(coffees.get(CoffeType.Cappuccino).prepare(ingredients));
                break;
            }
            default:{
                System.out.println("Don't understand");
            }
        }
    }
    void fill(){
        ingredients.fill();
    }
    void remaining(){
        ingredients.remaining();
        money.showActualAmount();
    }
    void take(){
        System.out.println("Money has been taken -> " + money.takeMoney());
    }

}
