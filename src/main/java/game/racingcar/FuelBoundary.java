package game.racingcar;

public enum FuelBoundary {
	LOWER(0), UPPER(9), MINIMUM_TO_GO(4);

	private final int value;

	FuelBoundary(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
