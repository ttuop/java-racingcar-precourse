package game.racingcar;

import static game.racingcar.LengthLimitation.*;
import static game.racingcar.Message.*;

/**
 * 자동차 이름
 *
 * @author ttuop
 */
class CarName {

	private final String name;

	CarName(String name) {
		validate(name);

		this.name = name;
	}

	private void validate(String name) {
		if (name == null || name.length() > CAR_NAME_LENGTH.getLength()) {
			throw new IllegalArgumentException(INVALID_NAME_MESSAGE.getMessage());
		}
	}

	String get() {
		return name;
	}
}
