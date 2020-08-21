package gt.edu.umg.flores.controller.SaludoGET.HTMLController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHTML {

	@GetMapping("/")
	public String saludoHtml() {
		return "Hola mundo";
	}
}
