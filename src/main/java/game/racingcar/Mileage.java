package game.racingcar;

public class Mileage {

	private int value;

	public void increase(MoveResult go) {
		value += go.getValue();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < value; i++) {
			builder.append("-");
		}

		return builder.toString();
	}
}
