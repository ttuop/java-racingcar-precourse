package game.racingcar;

import static game.racingcar.Message.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EngineTest {

	Engine engine = new Engine();

	@DisplayName("엔진이 정지하는 경우 테스트")
	@ParameterizedTest
	@ValueSource(ints = {0, 3})
	void testStop(int input) {
		assertThat(engine.run(new Fuel(input))).isEqualTo(MoveResult.STOP);
	}

	@DisplayName("엔진이 이동하는 경우 테스트")
	@ParameterizedTest
	@ValueSource(ints = {4, 9})
	void testMove(int input) {
		assertThat(engine.run(new Fuel(input))).isEqualTo(MoveResult.GO);
	}

	@DisplayName("연료가 null 인 경우 테스트")
	@Test
	void testNullFuel() {
		assertThatThrownBy(() -> engine.run(null))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage(INVALID_FUEL_MESSAGE.getMessage());
	}

}
