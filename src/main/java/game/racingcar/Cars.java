package game.racingcar;

import static game.racingcar.Message.*;
import static game.racingcar.SpecialChar.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 자동차 그룹
 *
 * @author ttuop
 */
public class Cars {

	private final List<Car> list;

	public Cars(String str) {
		validateNames(str);

		String[] names = str.split(COMMA.getValue());
		list = new ArrayList<>(names.length);

		for (String name : names) {
			list.add(new Car(new CarName(name)));
		}
	}

	private void validateNames(String names) {
		if (names == null || names.length() == 0) {
			throw new IllegalArgumentException(INVALID_NAME_MESSAGE.getMessage());
		}
	}

	public void move() {
		for (Car car : list) {
			car.move(new Fuel(RandomNumber.get()));
		}
	}

	/**
	 * 등록된 자동차들의 이름과 현재 마일리지 상태를 RacingSnapShot 에 저장하여 반환
	 *
	 * @return 레이싱 스냅샷 객체
	 */
	public RacingSnapShot getSnapShot() {
		Map<CarName, Mileage> map = new LinkedHashMap<>();
		list.forEach(car -> map.put(car.getName(), new Mileage(car.getMileage())));

		return new RacingSnapShot(map);
	}
}
