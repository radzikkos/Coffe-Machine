package edu.coffemachine.coffetype;

public enum CoffeType {
    Espresso,
    Latte,
    Cappuccino;

    public String toString() {
        switch (this){
            case Espresso: return "Espresso";
            case Cappuccino: return "Cappucinno";
            case Latte: return "Latte";
        }
        return "Don't knot this coffe type";
    }
}
