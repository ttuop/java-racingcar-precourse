package game.racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MileageTest {

	@DisplayName("이동했을 경우 증가하는 마일리지 상태 출력 테스트")
	@Test
	void testGetIncreasedMileageStatus() {
		Mileage mileage = new Mileage();
		mileage.increase(MoveResult.GO);

		assertThat(mileage.toString()).isEqualTo("-");
	}

	@DisplayName("정지했을 경우 증가하지 않는 마일리지 상태 출력 테스트")
	@Test
	void testGetNotIncreasedMileageStatus() {
		Mileage mileage = new Mileage();
		mileage.increase(MoveResult.STOP);

		assertThat(mileage.toString()).isEqualTo("");
	}

	@DisplayName("기본 마일리지 테스트")
	@Test
	void testGetDefaultMileage() {
		Mileage mileage = new Mileage();

		assertThat(mileage.get()).isEqualTo(0);
	}

	@DisplayName("이동 후 마일리지 테스트")
	@Test
	void testGetIncreasedMileage() {
		Mileage mileage = new Mileage();
		mileage.increase(MoveResult.GO);

		assertThat(mileage.get()).isEqualTo(1);
	}

	@DisplayName("정지 후 마일리지 테스트")
	@Test
	void testGetNotIncreasedMileage() {
		Mileage mileage = new Mileage();
		mileage.increase(MoveResult.STOP);

		assertThat(mileage.get()).isEqualTo(0);
	}
}
