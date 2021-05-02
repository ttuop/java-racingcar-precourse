package game.racingcar;

import static game.racingcar.FuelBoundary.*;

import java.util.Random;

public class RandomNumber {

	private static final Random RANDOM = new Random();

	static int get() {
		return RANDOM.nextInt(UPPER.getValue());
	}
}
