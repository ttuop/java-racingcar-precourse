package game.racingcar;

import static game.racingcar.FuelBoundary.*;
import static game.racingcar.Message.*;

/**
 * 자동차 연료
 *
 * @author ttuop
 */
class Fuel {

	final private int amount;

	Fuel(int amount) {
		validate(amount);

		this.amount = amount;
	}

	private void validate(int amount) {
		if (amount < LOWER.getValue() || amount > UPPER.getValue()) {
			throw new IllegalArgumentException(INVALID_NUMBER_MESSAGE.getMessage());
		}
	}

	boolean isEnough() {
		return amount >= MINIMUM_TO_GO.getValue();
	}

}
