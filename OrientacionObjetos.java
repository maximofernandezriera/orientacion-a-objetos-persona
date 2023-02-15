package objetos;

public class OrientacionObjetos {

	/**
	 * Un breve acercamiento a la programación orientada a objetos
	 */
	public static void main(String[] args) {
		
		Persona persona = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona(); 
		
		persona.nacer();
		persona.hablar();
		persona.caminar();
		persona.morir();
		
		persona2.nacer();
		
		persona3.caminar();
		
	}

}
