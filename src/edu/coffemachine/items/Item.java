package edu.coffemachine.items;

abstract public class Item {
    String itemName;
    int amount;
//    final int amountToUse;
    boolean isAbleToBeUsed = false;
    final int amountToBegin;
    final ItemType itemType;
    Item(int amountToBegin,/* int amountToUse,*/ String itemName,ItemType itemType) {
        this.amountToBegin = amountToBegin;
//        this.amountToUse = amountToUse;
        this.itemName = itemName;
        this.itemType = itemType;
        restore();
    }
    public void restore() {
        amount = amountToBegin;
    }

    public boolean checkIfItsAbleToBeUsedWithThisValue(int amountToUse){
        if(amount - amountToUse >= 0 ){
            isAbleToBeUsed = true;
        }
        else{
            isAbleToBeUsed = false;
        }
        return isAbleToBeUsed;
    }
    public void decreaseAmount(int amountToUse) {
        if(isAbleToBeUsed){
            amount -= amountToUse;
            isAbleToBeUsed = false;
            return;
        }
        System.out.println("Lack of " + itemName);
    }
    public void showActualAmount(){
        System.out.println(amount + " of " + itemName);
    }

}
