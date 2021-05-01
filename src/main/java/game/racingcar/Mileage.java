package game.racingcar;

public class Mileage {
	private int value;

	public void increase(MoveResult go) {
		value += go.getValue();
	}

	public int get() {
		return value;
	}
}
