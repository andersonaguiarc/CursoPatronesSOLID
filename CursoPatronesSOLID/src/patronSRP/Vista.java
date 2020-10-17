package patronSRP;

import java.util.stream.Collectors;
import java.util.List;

public class Vista {

private Servicio servicio;
//private Servicio servicio2;
	
	public Vista (Servicio service) {
		this.servicio = service;
	}
	
	
	public String report () {
		
		return "Report :\n" + 
				 this.lista();
	}
	
	
	public String lista() {
		
		List<String> clientes = servicio.listaClientes();
		
		return clientes.stream().collect(Collectors.joining(","));
		
	}
}
