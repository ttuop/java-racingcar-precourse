package game.racingcar;

public class CarName {

	private static final int MAX_LENGTH = 5;
	private static final String INVALID_NAME_MESSAGE = "이름이 유효하지 않습니다.";

	private final String name;

	public CarName(String name) {
		if (name == null || name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException(INVALID_NAME_MESSAGE);
		}

		this.name = name;
	}

	public String get() {
		return name;
	}
}
