package demo.uno.codigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JugadorFutbol implements Jugador{
	
	@Autowired
	@Qualifier("rutinaFutbolServices")
	private RutinaService rutinaService;

	@Override
	public String ObtRutinaDiaria() {
		// TODO Auto-generated method stub
		return rutinaService.rutinaDiaria();
	}
	
}
