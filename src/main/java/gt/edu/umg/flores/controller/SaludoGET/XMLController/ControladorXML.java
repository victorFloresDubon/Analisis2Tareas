package gt.edu.umg.flores.controller.SaludoGET.XMLController;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorXML {
	
	@GetMapping(path = "/saludo.xml", produces = MediaType.APPLICATION_XML_VALUE)
	public Saludo saludoXML()
	{
		Saludo saludo = new Saludo();
		saludo.setSaludo("Hola Mundo");
		return saludo;
	}

}
