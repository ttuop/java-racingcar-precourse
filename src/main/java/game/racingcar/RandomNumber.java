package game.racingcar;

import java.util.Random;

public class RandomNumber {

	private static final Random RANDOM = new Random();

	static int get() {
		return RANDOM.nextInt(9);
	}
}
