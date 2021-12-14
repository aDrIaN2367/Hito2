package cuestión3;

public class Animal {
	 public void sonido() {
		System.out.println("El animal esta emitiendo un sonido");
	}
	 
	 public static void main(String[] args) {
		 
		//Declartacion de un nuevo Animal
		 Animal caballo1 = new Caballo();
		 caballo1.sonido();
		 
		//Declartacion de un segundo Animal importado a la clase a Animal desde Gato
		 Animal gato1 = new Gato();
		 gato1.sonido();
	 }
}
