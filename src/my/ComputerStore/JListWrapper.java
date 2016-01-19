package my.ComputerStore;



import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JListWrapper {
	private List <String> Pcpart;
	
	@XmlElement(name = "Pcpart")
	public List <String> getPcParts(){
		return Pcpart;
	}
	
	public void setPcparts(JMenuItem mntmSave){
		this.Pcpart = Pcpart;
	}

}
