package game.racingcar;

public enum Message {
	INVALID_FUEL_MESSAGE("연료가 유효하지 않습니다."),
	INVALID_NAME_MESSAGE("이름이 유효하지 않습니다."),
	INVALID_NUMBER_MESSAGE("유효하지 않은 숫자입니다."),
	INVALID_PLAY_COUNT_MESSAGE("실행횟수는 숫자를 입력해주세요."),
	INVALID_SNAPSHOT_MESSAGE("스냅샷이 유효하지 않습니다."),
	WINNER_FORMAT_MESSAGE("%s가 최종 우승했습니다.%n");

	private final String message;

	Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
