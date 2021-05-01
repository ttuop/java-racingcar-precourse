package game.racingcar;

public class Engine {

	public MoveResult run(Fuel fuel) {
		return fuel.isEnough() ? MoveResult.GO : MoveResult.STOP;
	}

}
