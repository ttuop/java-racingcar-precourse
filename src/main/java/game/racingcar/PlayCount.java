package game.racingcar;

/**
 * 자동차 이동 횟수
 *
 * @author ttuop
 */
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
