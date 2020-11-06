package edu.coffemachine.coffetype;

import edu.coffemachine.items.Ingredients;

public interface Prepare {
    boolean checkIfIsPossibleToPrepare(Ingredients ingredients);
    int prepare(Ingredients ingredients);
}
