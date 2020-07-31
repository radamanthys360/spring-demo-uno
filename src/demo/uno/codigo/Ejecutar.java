package demo.uno.codigo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ejecutar {

	public static void main(String[] args) {

		//leyendo configuracion de spring 
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Jugador jugadorFutbol = context.getBean("jugadorFutbol", Jugador.class);
		
		System.out.println(jugadorFutbol.ObtRutinaDiaria());
		
		context.close();
		
	}

}
