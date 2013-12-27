package myastro.constants.matchmaker;

public enum MatchResult {

	UTTAMA(1),

	MADHYAMA(0),

	ADHAMA(-1),

	DEPENDS(2);

	private MatchResult(int value) {
		this.value = value;
	}

	private int value;

	public int getValue() {
		return value;
	}

}
