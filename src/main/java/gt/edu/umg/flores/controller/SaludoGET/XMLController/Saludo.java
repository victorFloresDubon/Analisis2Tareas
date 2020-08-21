package gt.edu.umg.flores.controller.SaludoGET.XMLController;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Saludo {
	
	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	
}
