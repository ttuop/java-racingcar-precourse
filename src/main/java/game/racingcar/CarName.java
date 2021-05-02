package game.racingcar;

import static game.racingcar.LengthLimitation.*;
import static game.racingcar.Message.*;

public class CarName {

	private final String name;

	public CarName(String name) {
		if (name == null || name.length() > NAME_LENGTH.getLength()) {
			throw new IllegalArgumentException(INVALID_NAME_MESSAGE.getMessage());
		}

		this.name = name;
	}

	public String get() {
		return name;
	}
}
