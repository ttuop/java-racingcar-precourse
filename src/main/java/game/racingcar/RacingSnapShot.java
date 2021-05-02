package game.racingcar;

import java.util.Map;

public class RacingSnapShot {

	private static final String INVALID_SNAPSHOT_LIST_MESSAGE = "스냅샷이 유효하지 않습니다.";

	private final Map<CarName, Mileage> map;

	public RacingSnapShot(Map<CarName, Mileage> map) {
		if (map == null) {
			throw new IllegalArgumentException(INVALID_SNAPSHOT_LIST_MESSAGE);
		}

		this.map = map;
	}

	public void print() {
		for (Map.Entry<CarName, Mileage> entry : map.entrySet()) {
			System.out.println(entry.getKey().get() + " : " + entry.getValue());
		}

		System.out.println();
	}
}
