/**
 * Definición e implementación de una clase
 */
package objetos;

/**
 * Un pequeño ejemplo de implementación de la clase Persona
 */
class Persona {
	
	
	//Estructura, conocida como  propiedades o atributos
	String nombre;
	String apellidos;
	int edad;
	int altura;
	float peso;
	
	//Comportamiento, conocido como métodos
	void caminar() {
		System.out.println("Estoy caminando");
	}
	
	void hablar() {
		System.out.println("Estoy hablando");
	}
	
	void nacer() {
		System.out.println("Acabo de nacer!!!");
	}
	
	void morir() {
		System.out.println("Hasta más ver!");
	}
	

}
