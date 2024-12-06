import java.util.Optional;

public class HolaDesdeGitHub {
    public static void main(String[] args) {
        // Obtiene la variable de entorno "USERNAME"
        String nombre = System.getenv("USERNAME");

        // Si no se encuentra, establece un valor por defecto
        nombre = Optional.ofNullable(nombre).orElse("Usuario");

        // Imprime el mensaje
        System.out.println("¡Hola, " + nombre + " desde GitHub!");
    }
}
