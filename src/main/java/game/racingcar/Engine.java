package game.racingcar;

import static game.racingcar.Fuels.*;

public class Engine {

	public MoveResult run(Fuel fuel) {
		if (fuel == null) {
			throw new IllegalArgumentException(INVALID_FUEL_MESSAGE);
		}

		return fuel.isEnough() ? MoveResult.GO : MoveResult.STOP;
	}

}
