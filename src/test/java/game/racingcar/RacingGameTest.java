package game.racingcar;

import static game.racingcar.Message.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RacingGameTest {

	@ParameterizedTest
	@ValueSource(strings = {"", "abc", "0", "99"})
	void testInvalidPlayCount(String input) {
		assertThatThrownBy(() -> new RacingGame("111,222", input))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage(INVALID_PLAY_COUNT_MESSAGE.getMessage());
	}

}
