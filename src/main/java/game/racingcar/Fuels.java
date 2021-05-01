package game.racingcar;

import java.util.ArrayDeque;
import java.util.Queue;

public class Fuels {

	public static final String INVALID_FUEL_MESSAGE = "연료가 유효하지 않습니다.";

	private final Queue<Fuel> queue = new ArrayDeque<>();

	public void fill(Fuel fuel) {
		if (fuel == null) {
			throw new IllegalArgumentException(INVALID_FUEL_MESSAGE);
		}

		queue.add(fuel);
	}

	public Fuel getFuel() {
		return queue.poll();
	}
}
