package demo.uno.codigo;

import org.springframework.stereotype.Component;

@Component
public class RutinaFutbolServices implements RutinaService{

	@Override
	public String rutinaDiaria() {
		return "correr 30 veces en la cancha"
				+ " disparar al arco 30 veces";
	}
	
	

}
