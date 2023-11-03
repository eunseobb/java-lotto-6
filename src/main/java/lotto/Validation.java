package lotto;

import static lotto.Message.*;

public class Validation {
    public boolean isOkCost(String input){
        return true;
    }
    public boolean isInteger(String input){
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(NOT_INTEGER_ERROR);
        }
        return true;
    }

    public boolean isPositive(String input){
        if (Integer.parseInt(input)<=0)
            throw new IllegalArgumentException(NEGATIVE_ERROR);
        return true;
    }

    public boolean isThousands(String input){
        if (Integer.parseInt(input)%1000!=0)
            throw new IllegalArgumentException(THOUSANDS_ERROR);
        return true;
    }

    public boolean isInRange(String input) {
        int inputNumber = Integer.parseInt(input);
        if (isPositive(input)&&inputNumber<=45)
            return true;
        throw new IllegalArgumentException(RANGE_ERROR);
    }

    public boolean isDistinct(String input){

    }
}
