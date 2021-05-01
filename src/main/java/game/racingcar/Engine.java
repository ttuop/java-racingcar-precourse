package game.racingcar;

public class Engine {

	public static final String INVALID_FUEL_MESSAGE = "연료가 유효하지 않습니다.";

	public MoveResult run(Fuel fuel) {
		if (fuel == null) {
			throw new IllegalArgumentException(INVALID_FUEL_MESSAGE);
		}

		return fuel.isEnough() ? MoveResult.GO : MoveResult.STOP;
	}

}
