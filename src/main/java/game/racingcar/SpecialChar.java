package game.racingcar;

public enum SpecialChar {
	DASH("-"), COMMA(","), COLON_SEPARATOR(" : ");

	private final String value;

	SpecialChar(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
