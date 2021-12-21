package API.obj;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "opendata")
public class ID301ObjList {

	@XmlElement(name = "data")
	private List<ID301Obj> id301ObjLst = new ArrayList<>();

	public List<ID301Obj> getId301ObjLst() {
		return id301ObjLst;
	}

	public void setId301ObjLst(List<ID301Obj> id301ObjLst) {
		this.id301ObjLst = id301ObjLst;
	}

}
