package game.racingcar;

import static game.racingcar.Message.*;
import static game.racingcar.PlayCount.*;

/**
 * 자동차 레이싱 게임
 *
 * @author ttuop
 */
public class RacingGame {

	private final int playCount;
	private final Cars cars;
	private RacingSnapShot snapShot;

	public RacingGame(String names, String countStr) {
		this.playCount = parsePlayCount(countStr);
		validateCount(playCount);

		cars = new Cars(names);
	}

	private int parsePlayCount(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(INVALID_PLAY_COUNT_MESSAGE.getMessage());
		}
	}

	/**
	 * 사용자가 입력한 자동차들을 랜덤 값에 따라 이동시키거나 정지시키고 자동차들의 상태를 출력한다.
	 * 레이싱이 끝나면 최종 우승자를 출력한다.
	 */
	public void play() {
		for (int i = 0; i < playCount; i++) {
			cars.move();
			snapShot = cars.getSnapShot();
			snapShot.print();
		}

		snapShot.printWinner();
	}

	private void validateCount(int count) {
		if (count < MINIMUM.getCount() || count > MAXIMUM.getCount()) {
			throw new IllegalArgumentException(INVALID_PLAY_COUNT_MESSAGE.getMessage());
		}
	}

}
