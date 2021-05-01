package game.racingcar;

import java.util.ArrayDeque;
import java.util.Queue;

public class Fuels {

	private final Queue<Fuel> queue = new ArrayDeque<>();

	public void fill(Fuel fuel) {
		queue.add(fuel);
	}

	public Fuel getFuel() {
		return queue.poll();
	}
}
