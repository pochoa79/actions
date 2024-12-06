import java.util.Optional;

public class HolaMundo {
    public static void main(String[] args) {
        // Obtiene la variable de entorno "USERNAME"
        String nombre = System.getenv("USERNAME");

        // Si no se encuentra, establece un valor por defecto
        nombre = Optional.ofNullable(nombre).orElse("Usuario"

        // Imprime el mensaje mi primera 
        System.out.println("¡Hola, " + nombre + " desde GitHub con GitAction!"); 
    }
}
