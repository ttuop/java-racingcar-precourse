package game.racingcar;

public enum LengthLimitation {
	NAME_LENGTH(5);

	private final int length;

	LengthLimitation(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}
}
