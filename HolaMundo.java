import java.util.Optional;

public class HolaMundo {
    public static void main(String[] args) {
        // Obtiene la variable de entorno "USERNAME"
        String nombre = System.getenv("USERNAME");

        // Si no se encuentra, establece un valor por defecto
        nombre = Optional.ofNullable(nombre).orElse("Usuario");

        // Imprime el mensaje mi primera prueba
        System.out.println("¡Hola, " + nombre + " desde GitHub!"); 
    }
}
