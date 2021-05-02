package game.racingcar;

import static game.racingcar.Message.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarsTest {

	@ParameterizedTest
	@ValueSource(strings = {""})
	void testInvalidCarNames(String input) {
		assertThatThrownBy(() -> new Cars(input)).isInstanceOf(IllegalArgumentException.class)
			.hasMessage(INVALID_NAME_MESSAGE.getMessage());
	}

}
