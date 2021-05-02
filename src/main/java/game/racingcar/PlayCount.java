package game.racingcar;

public enum PlayCount {
	MINIMUM(1), MAXIMUM(10);

	private final int count;

	PlayCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}
}
