package gt.edu.umg.flores.controller.SaludoGET.JSONController;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Devuelve un saludo en formato JSON
@RestController
public class ControladorJSON {
	@GetMapping("/saludo.json")
	public HashMap<String, Object> saludoJSON() 
	{
		HashMap<String, Object> map = new HashMap<>();
		map.put("saludo", "Hola Mundo");
		return map;
	}

}
