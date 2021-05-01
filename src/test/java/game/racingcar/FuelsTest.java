package game.racingcar;

import static game.racingcar.Fuels.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FuelsTest {

	@DisplayName("정상적인 연료 테스트")
	@Test
	void testGetFuel() {
		Fuel fuel = new Fuel(0);

		Fuels fuels = new Fuels();
		fuels.fill(fuel);

		assertThat(fuels.getFuel()).isEqualTo(fuel);
	}

	@DisplayName("유효하지 않은 연료 테스트")
	@Test
	void testInvalidFuel() {
		Fuels fuels = new Fuels();
		assertThatThrownBy(() -> {
			fuels.fill(null);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessage(INVALID_FUEL_MESSAGE);
	}
}
