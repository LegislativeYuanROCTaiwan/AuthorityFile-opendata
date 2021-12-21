package API.obj;

public class ID301Obj {

	private String law;
	private String usedFor;

	public String getLaw() {
		return law;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setLaw(String law) {
		this.law = law;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public ID301Obj() {
		super();
	}

	public ID301Obj(Object law, Object usedFor) {
		setLaw(String.valueOf(law));
		setUsedFor(String.valueOf(usedFor));
	}
}
