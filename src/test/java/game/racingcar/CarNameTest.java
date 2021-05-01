package game.racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarNameTest {

	@DisplayName("길이가 긴 이름 테스트")
	@Test
	void testTooLongCarName() {
		assertThatThrownBy(() -> new CarName("123455"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("이름이 유효하지 않습니다.");
	}

	@DisplayName("이름이 null 인 경우 테스트")
	@Test
	void testNullCarName() {
		assertThatThrownBy(() -> new CarName(null))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("이름이 유효하지 않습니다.");
	}

	@DisplayName("자동차 이름 테스트")
	@Test
	void testGetCarName() {
		CarName carName = new CarName("12345");

		assertThat(carName.get()).isEqualTo("12345");
	}
}
