package game.racingcar;

/**
 * 길이 제약사항
 * <ul>
 *     <li>
 *         {@link #CAR_NAME_LENGTH}: 자동차 이름 최대 길이
 *     </li>
 * </ul>
 *
 * @author ttuop
 */
public enum LengthLimitation {
	CAR_NAME_LENGTH(5);

	private final int length;

	LengthLimitation(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}
}
