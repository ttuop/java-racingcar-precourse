package game.racingcar;

public enum MoveResult {
	GO(1), STOP(0);

	private final int value;

	MoveResult(int value) {
		this.value = value;
	}
}
