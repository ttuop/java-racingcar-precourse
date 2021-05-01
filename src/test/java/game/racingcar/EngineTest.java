package game.racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EngineTest {

	@ParameterizedTest
	@ValueSource(ints = {0, 3})
	void testStop(int input) {
		Engine engine = new Engine(new Fuel(input));

		assertThat(engine.move()).isEqualTo(MoveResult.STOP);
	}

	@ParameterizedTest
	@ValueSource(ints = {4, 9})
	void testMove(int input) {
		Engine engine = new Engine(new Fuel(input));

		assertThat(engine.move()).isEqualTo(MoveResult.GO);
	}
}
