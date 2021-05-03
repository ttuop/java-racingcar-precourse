package game.racingcar;

/**
 * 마일리지
 *
 * @author ttuop
 */
class Mileage {

	private int value;

	Mileage() {
	}

	Mileage(Mileage mileage) {
		if (mileage == null) {
			this.value = 0;
			return;
		}

		this.value = mileage.get();
	}

	void increase(MoveResult result) {
		if (result == null) {
			return;
		}

		value += result.getValue();
	}

	int get() {
		return value;
	}
}
