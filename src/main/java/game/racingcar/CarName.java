package game.racingcar;

import static game.racingcar.LengthLimitation.*;
import static game.racingcar.Message.*;

/**
 * 자동차 이름
 *
 * @author ttuop
 */
public class CarName {

	private final String name;

	public CarName(String name) {
		if (name == null || name.length() > CAR_NAME_LENGTH.getLength()) {
			throw new IllegalArgumentException(INVALID_NAME_MESSAGE.getMessage());
		}

		this.name = name;
	}

	public String get() {
		return name;
	}
}
