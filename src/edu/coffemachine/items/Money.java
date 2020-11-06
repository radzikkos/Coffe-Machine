package edu.coffemachine.items;

public class Money extends Item{
    public Money(int amountToBegin){
        super(amountToBegin,"money", ItemType.Money);
    }

    @Override
    public void decreaseAmount(int amountToUse) {
        /**
         * Cannot decrease money
         */
    }

    @Override
    public boolean checkIfItsAbleToBeUsedWithThisValue(int amountToUse) {
        return true;
    }

    public int takeMoney(){
        var moneyToTake = super.amount;
        super.restore();
        return moneyToTake;
    }
    public void addAmount(int getPrice){
        super.amount += getPrice;
    }
}
