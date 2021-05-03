package game.racingcar;

/**
 * 자동차 이동 결과
 *
 * @author ttuop
 */
enum MoveResult {
	GO(1), STOP(0);

	private final int value;

	MoveResult(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}
}
