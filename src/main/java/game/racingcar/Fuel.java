package game.racingcar;

import static game.racingcar.FuelBoundary.*;
import static game.racingcar.Message.*;

/**
 * 자동차 연료
 *
 * @author ttuop
 */
public class Fuel {

	final private int amount;

	public Fuel(int amount) {
		if (amount < LOWER.getValue() || amount > UPPER.getValue()) {
			throw new IllegalArgumentException(INVALID_NUMBER_MESSAGE.getMessage());
		}

		this.amount = amount;
	}

	public boolean isEnough() {
		return amount >= MINIMUM_TO_GO.getValue();
	}

}
