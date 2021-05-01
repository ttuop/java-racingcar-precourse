package game.racingcar;

public class Engine {

	private final Fuel fuel;

	public Engine(Fuel fuel) {
		this.fuel = fuel;
	}

	public MoveResult move() {
		return fuel.isEnough() ? MoveResult.GO : MoveResult.STOP;
	}

}
