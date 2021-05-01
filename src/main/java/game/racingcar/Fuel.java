package game.racingcar;

/**
 * 연료 클래스
 *
 * @author ttuop
 */
public class Fuel {

	public static final String INVALID_NUMBER_EXCEPTION = "유효하지 않은 숫자입니다.";

	final private int amount;

	public Fuel(int amount) {
		if (amount < 0 || amount > 9) {
			throw new IllegalArgumentException(INVALID_NUMBER_EXCEPTION);
		}

		this.amount = amount;
	}

	public boolean isEnough() {
		return amount > 3;
	}

}
