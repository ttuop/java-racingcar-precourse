package game.racingcar;

import static game.racingcar.Message.*;
import static game.racingcar.MoveResult.*;

public class Engine {

	public MoveResult run(Fuel fuel) {
		if (fuel == null) {
			throw new IllegalArgumentException(INVALID_FUEL_MESSAGE.getMessage());
		}

		return fuel.isEnough() ? GO : STOP;
	}

}
