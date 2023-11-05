package lotto;

import static lotto.Message.COST_ERROR;
import static lotto.Message.ENTER_COST;

import camp.nextstep.edu.missionutils.Console;

public class User {
    Validation validation = new Validation();

    public Long enterCost() {
        System.out.println(ENTER_COST);
        String cost = Console.readLine();
        if (validation.isOkCost(cost)) {
            return Long.parseLong(cost);
        }
        throw new IllegalArgumentException(COST_ERROR);
    }

    public void enterWinningNumber() {
        String winningNumber = Console.readLine();
        
    }

    public void enterBonusNumber() {
        String bonusNumber = Console.readLine();
    }
}
