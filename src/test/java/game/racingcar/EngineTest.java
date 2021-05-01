package game.racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EngineTest {

	Engine engine = new Engine();

	@ParameterizedTest
	@ValueSource(ints = {0, 3})
	void testStop(int input) {
		assertThat(engine.run(new Fuel(input))).isEqualTo(MoveResult.STOP);
	}

	@ParameterizedTest
	@ValueSource(ints = {4, 9})
	void testMove(int input) {
		assertThat(engine.run(new Fuel(input))).isEqualTo(MoveResult.GO);
	}

}
