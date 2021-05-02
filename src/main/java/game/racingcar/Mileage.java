package game.racingcar;

public class Mileage {

	private int value;

	public Mileage() {
	}

	public Mileage(Mileage mileage) {
		this.value = mileage.get();
	}

	public void increase(MoveResult go) {
		value += go.getValue();
	}

	public int get() {
		return value;
	}
}
