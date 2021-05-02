package game.racingcar;

import static game.racingcar.Constants.*;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class RacingSnapShot {

	private static final String INVALID_SNAPSHOT_LIST_MESSAGE = "스냅샷이 유효하지 않습니다.";

	private final Map<CarName, Mileage> map;

	public RacingSnapShot(Map<CarName, Mileage> map) {
		if (map == null) {
			throw new IllegalArgumentException(INVALID_SNAPSHOT_LIST_MESSAGE);
		}

		this.map = map;
	}

	/**
	 * 현재 스탭샷에 있는 자동차들의 상태를 출력한다.
	 */
	public void print() {
		for (Map.Entry<CarName, Mileage> entry : map.entrySet()) {
			System.out.println(entry.getKey().get() + " : " + convertDash(entry));
		}

		System.out.println();
	}

	private String convertDash(Map.Entry<CarName, Mileage> entry) {
		int cnt = entry.getValue().get();
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < cnt; i++) {
			builder.append(DASH);
		}

		return builder.toString();
	}

	/**
	 * 스냅샷에서 가장 멀리 이동한 차를 출력한다.
	 */
	public void printWinner() {
		Queue<String> winner = getWinner();
		StringBuilder builder = new StringBuilder();

		while (!winner.isEmpty()) {
			builder.append(winner.poll());
			appendDelimiter(winner, builder);
		}

		System.out.printf("%s가 최종 우승했습니다.%n", builder);
	}

	private Queue<String> getWinner() {
		final int highest = getHighestMileage();
		final Queue<String> queue = new ArrayDeque<>();

		map.forEach((carName, mileage) -> addName(highest, queue, carName, mileage));

		return queue;
	}

	private Integer getHighestMileage() {
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		map.forEach((carName, mileage) -> queue.add(mileage.get()));

		return queue.peek();
	}

	private void addName(int highest, Queue<String> queue, CarName carName, Mileage mileage) {
		if (mileage.get() == highest) {
			queue.add(carName.get());
		}
	}

	private void appendDelimiter(Queue<String> winner, StringBuilder builder) {
		if (!winner.isEmpty()) {
			builder.append(COMMA);
		}
	}
}
