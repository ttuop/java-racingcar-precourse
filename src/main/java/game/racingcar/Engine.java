package game.racingcar;

import static game.racingcar.Message.*;
import static game.racingcar.MoveResult.*;

/**
 * 자동차 엔진
 *
 * @author ttuop
 */
class Engine {

	MoveResult run(Fuel fuel) {
		validate(fuel);

		return fuel.isEnough() ? GO : STOP;
	}

	private void validate(Fuel fuel) {
		if (fuel == null) {
			throw new IllegalArgumentException(INVALID_FUEL_MESSAGE.getMessage());
		}
	}

}
