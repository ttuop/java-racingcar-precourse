package game.racingcar;

import static game.racingcar.Car.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {

	private final String name = "name";

	@DisplayName("자동차 기본 마일리지 테스트")
	@Test
	void testGetDefaultMileage() {
		Car car = new Car(new CarName(name));

		assertThat(car.toString()).isEqualTo(name + COLON);
	}

	@DisplayName("자동차 이동 테스트")
	@ParameterizedTest
	@ValueSource(ints = {4, 9})
	void testGetIncreasedMileage(int input) {
		Car car = new Car(new CarName("name"));
		car.move(new Fuel(input));

		assertThat(car.toString()).isEqualTo(name + COLON + "-");
	}

	@DisplayName("자동차 정지 테스트")
	@ParameterizedTest
	@ValueSource(ints = {0, 3})
	void testGetStop(int input) {
		Car car = new Car(new CarName("name"));
		car.move(new Fuel(input));

		assertThat(car.toString()).isEqualTo(name + COLON);
	}
}
