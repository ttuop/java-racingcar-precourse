package game.racingcar;

/**
 * 자동차 연료 유효 범위
 * <ul>
 *     <li>
 *         {@link #LOWER}: 최소 유효 값
 *     </li>
 *     <li>
 *         {@link #UPPER}: 최대 유효 값
 *     </li>
 *     <li>
 *         {@link #MINIMUM_TO_GO}: 이동하기 위해 필요한 최소 연료
 *     </li>
 * </ul>
 *
 * @author ttuop
 */
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
