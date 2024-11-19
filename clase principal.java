// Clase principal Main
public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Animal, pero en realidad son subclases
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        Animal miVaca = new Vaca();

        // Llamar al método hacerSonido para cada objeto
        miPerro.hacerSonido();  // Debería imprimir: ¡Guau!
        miGato.hacerSonido();   // Debería imprimir: ¡Miau!
        miVaca.hacerSonido();   // Debería imprimir: ¡Muu!
    }
}
