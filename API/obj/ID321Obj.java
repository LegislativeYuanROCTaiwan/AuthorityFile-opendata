package API.obj;

public class ID321Obj {

	private String keyWord;
	private String usedFor;

	public String getKeyWord() {
		return keyWord;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public ID321Obj() {
		super();
	}

	public ID321Obj(Object keyWord, Object usedFor) {
		setKeyWord(String.valueOf(keyWord));
		setUsedFor(String.valueOf(usedFor));
	}
}
