package game.racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CarTest {

	private final String name = "name";

	@DisplayName("자동차 이름 테스트")
	@Test
	void testGetCarName() {
		Car car = new Car(new CarName(name));

		assertThat(car.getName().get()).isEqualTo(name);
	}

	@DisplayName("자동차 마일리지 테스트")
	@ParameterizedTest
	@CsvSource({"0,0", "3,0", "4,1", "9,1"})
	void testGetIncreasedMileage(int input, int expected) {
		Car car = new Car(new CarName(name));
		car.move(new Fuel(input));

		assertThat(car.getMileage().get()).isEqualTo(expected);
	}
}
