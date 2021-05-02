package game.racingcar;

/**
 * 마일리지
 *
 * @author ttuop
 */
public class Mileage {

	private int value;

	public Mileage() {
	}

	public Mileage(Mileage mileage) {
		if (mileage == null) {
			this.value = 0;
			return;
		}

		this.value = mileage.get();
	}

	public void increase(MoveResult result) {
		if (result == null) {
			return;
		}

		value += result.getValue();
	}

	public int get() {
		return value;
	}
}
