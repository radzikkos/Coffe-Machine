package edu.coffemachine.items;

public class Water extends Item {
    public Water(int amountToBegin){
        super(amountToBegin,"water", ItemType.Water);
    }

    @Override
    public void decreaseAmount(int amountToUse) {
        super.decreaseAmount(amountToUse);
    }
}
