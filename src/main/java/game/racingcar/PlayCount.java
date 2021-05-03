package game.racingcar;

/**
 * 자동차 이동 횟수
 *
 * @author ttuop
 */
enum PlayCount {
	MINIMUM(1), MAXIMUM(10);

	private final int count;

	PlayCount(int count) {
		this.count = count;
	}

	int getCount() {
		return count;
	}
}
