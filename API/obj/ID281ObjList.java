package API.obj;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "opendata")
public class ID281ObjList {

	@XmlElement(name = "data")
	private List<ID281Obj> id281ObjLst = new ArrayList<>();

	public List<ID281Obj> getId281ObjLst() {
		return id281ObjLst;
	}

	public void setId281ObjLst(List<ID281Obj> id281ObjLst) {
		this.id281ObjLst = id281ObjLst;
	}

}
