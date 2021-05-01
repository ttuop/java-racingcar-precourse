package game.racingcar;

public class Engine {

	public MoveResult run(Fuel fuel) {
		if (fuel == null) {
			return MoveResult.STOP;
		}

		return fuel.isEnough() ? MoveResult.GO : MoveResult.STOP;
	}

}
