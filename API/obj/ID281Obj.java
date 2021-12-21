package API.obj;

public class ID281Obj {

	private String institution;
	private String usedFor;
	private String institutionSynonym;

	public String getInstitution() {
		return institution;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public String getInstitutionSynonym() {
		return institutionSynonym;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public void setInstitutionSynonym(String institutionSynonym) {
		this.institutionSynonym = institutionSynonym;
	}

	public ID281Obj() {
		super();
	}

	public ID281Obj(Object institution, Object usedFor, Object institutionSynonym) {
		setInstitution(String.valueOf(institution));
		setUsedFor(String.valueOf(usedFor));
		setInstitutionSynonym(String.valueOf(institutionSynonym));
	}
}
