package game.racingcar;

import static game.racingcar.FuelBoundary.*;

import java.util.Random;

/**
 * 랜덤 번호 생성기
 *
 * @author ttuop
 */
public class RandomNumber {

	private static final Random RANDOM = new Random();
	private static final int BOUND = 10;

	static int get() {
		return RANDOM.nextInt(BOUND);
	}
}
