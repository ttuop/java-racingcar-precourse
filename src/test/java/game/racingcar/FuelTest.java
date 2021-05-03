package game.racingcar;

import static game.racingcar.Message.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FuelTest {

	@DisplayName("연료가 불충분한 경우 테스트")
	@ParameterizedTest
	@ValueSource(ints = {0, 3})
	void testIsNotEnough(int input) {
		Fuel fuel = new Fuel(input);

		assertThat(fuel.isEnough()).isFalse();
	}

	@DisplayName("연료가 충분한 경우 테스트")
	@ParameterizedTest
	@ValueSource(ints = {4, 9})
	void testIsEnough(int input) {
		Fuel fuel = new Fuel(input);

		assertThat(fuel.isEnough()).isTrue();
	}

	@DisplayName("연료 유효성 체크")
	@ParameterizedTest
	@ValueSource(ints = {-1, 10})
	void testValidate(int input) {
		assertThatThrownBy(() -> new Fuel(input)).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining(INVALID_NUMBER_MESSAGE.getMessage());
	}

}
