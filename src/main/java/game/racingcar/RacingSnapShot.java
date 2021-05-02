package game.racingcar;

import static game.racingcar.Message.*;
import static game.racingcar.SpecialChar.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 자동차 그룹 스냅샷
 *
 * @author ttuop
 */
public class RacingSnapShot {

	private final Map<CarName, Mileage> map;

	public RacingSnapShot(Map<CarName, Mileage> map) {
		if (map == null) {
			throw new IllegalArgumentException(INVALID_SNAPSHOT_MESSAGE.getMessage());
		}

		this.map = map;
	}

	/**
	 * 현재 스탭샷에 있는 자동차들의 상태를 출력한다.
	 */
	public void print() {
		for (Map.Entry<CarName, Mileage> entry : map.entrySet()) {
			System.out.println(entry.getKey().get() + COLON_SEPARATOR.getValue() + convertDash(entry));
		}

		System.out.println();
	}

	private String convertDash(Map.Entry<CarName, Mileage> entry) {
		int cnt = entry.getValue().get();
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < cnt; i++) {
			builder.append(DASH.getValue());
		}

		return builder.toString();
	}

	/**
	 * 스냅샷에서 가장 멀리 이동한 차를 출력한다.
	 */
	public void printWinner() {
		List<String> winner = getWinner();

		System.out.printf(WINNER_FORMAT_MESSAGE.getMessage(), String.join(COMMA.getValue(), winner));
	}

	private List<String> getWinner() {
		final int highest = getHighestMileage();
		final List<String> list = new LinkedList<>();

		map.forEach((carName, mileage) -> addName(highest, list, carName, mileage));

		return list;
	}

	private Integer getHighestMileage() {
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		map.forEach((carName, mileage) -> queue.add(mileage.get()));

		return queue.peek();
	}

	private void addName(int highest, List<String> list, CarName carName, Mileage mileage) {
		if (mileage.get() == highest) {
			list.add(carName.get());
		}
	}

}
