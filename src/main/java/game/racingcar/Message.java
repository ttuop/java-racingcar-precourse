package game.racingcar;

/**
 * 게임 메시지
 *
 * @author ttuop
 */
enum Message {
	INPUT_NAME_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)를 기준으로 구분하고 5자 이내만 가능합니다.)"),
	INPUT_PLAY_COUNT_MESSAGE("시도할 회수는 몇 회인가요? (1회에서 10회까지 가능합니다.)"),
	INVALID_FUEL_MESSAGE("연료가 유효하지 않습니다."),
	INVALID_NAME_MESSAGE("이름이 유효하지 않습니다."),
	INVALID_NUMBER_MESSAGE("유효하지 않은 숫자입니다."),
	INVALID_PLAY_COUNT_MESSAGE("실행횟수는 숫자를 입력해주세요."),
	INVALID_SNAPSHOT_MESSAGE("스냅샷이 유효하지 않습니다."),
	WINNER_FORMAT_MESSAGE("%s가 최종 우승했습니다.%n"),
	RACING_RESULT_MESSAGE("실행 결과");

	private final String message;

	Message(String message) {
		this.message = message;
	}

	String getMessage() {
		return message;
	}
}
