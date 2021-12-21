package API.obj;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "opendata")
public class ID321ObjList {

	@XmlElement(name = "data")
	private List<ID321Obj> id321ObjLst = new ArrayList<>();

	public List<ID321Obj> getId321ObjLst() {
		return id321ObjLst;
	}

	public void setId321ObjLst(List<ID321Obj> id321ObjLst) {
		this.id321ObjLst = id321ObjLst;
	}

}
