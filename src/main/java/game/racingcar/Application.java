package game.racingcar;

import static game.racingcar.Message.*;

/**
 * 레이싱게임 애플리케이션
 *
 * @author ttuop
 */
public class Application {

	public static void main(String[] args) {
		try {
			UserInterface.send(INPUT_NAME_MESSAGE.getMessage());
			String names = UserInterface.receive();
			UserInterface.send(INPUT_PLAY_COUNT_MESSAGE.getMessage());
			String count = UserInterface.receive();

			RacingGame game = new RacingGame(names, count);
			game.play();
		} finally {
			UserInterface.shutdown();
		}
	}

}
