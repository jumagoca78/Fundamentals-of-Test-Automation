import java.util.ArrayList;
import java.util.List;

/*
 * 
 * La clase Bebida tiene un constructor que toma un String para el nombre y una List<Integer> para los tamaños.
*  El método crearDesdeEntrada toma una cadena de entrada, valida el formato y, si es válido, crea y devuelve una instancia de Bebida.
*  Se utilizan expresiones regulares para validar que el nombre contenga solo caracteres alfabéticos y 
*  tenga una longitud de 2 a 15 caracteres.
*  Los tamaños se validan para asegurarse de que estén en el rango de 1 a 48 y que se ingresen en orden ascendente. 
*  Además, se verifica que no haya más de cinco tamaños.
*  El método toString se ha implementado para facilitar la depuración.
 */

public class Bebida {
    private String nombre;
    private List<Integer> tamanos;

    public Bebida(String nombre, List<Integer> tamanos) {
        this.nombre = nombre;
        this.tamanos = tamanos;
    }

    public static Bebida crearDesdeEntrada(String entrada) throws IllegalArgumentException {
        entrada = entrada.replaceAll("\\s+", ""); // Elimina espacios en blanco
        String[] partes = entrada.split(",");
        
        if (partes.length < 2) {
            throw new IllegalArgumentException("Formato de entrada inválido. Se requiere al menos un tamaño.");
        }

        String nombre = partes[0];
        if (!nombre.matches("[a-zA-Z]{2,15}")) {
            throw new IllegalArgumentException("Nombre de bebida inválido.");
        }

        List<Integer> tamanos = new ArrayList<>();
        for (int i = 1; i < partes.length; i++) {
            int tamano = Integer.parseInt(partes[i]);
            if (tamano < 1 || tamano > 48) {
                throw new IllegalArgumentException("Tamaño " + tamano + " fuera de rango.");
            }
            if (i > 1 && tamano <= tamanos.get(i - 2)) {
                throw new IllegalArgumentException("Los tamaños deben estar en orden ascendente.");
            }
            tamanos.add(tamano);
        }

        if (tamanos.size() > 5) {
            throw new IllegalArgumentException("No se pueden ingresar más de cinco tamaños.");
        }

        return new Bebida(nombre, tamanos);
    }

    // Métodos getters y setters aquí si es necesario

    @Override
    public String toString() {
        return "Bebida{" +
                "nombre='" + nombre + '\'' +
                ", tamanos=" + tamanos +
                '}';
    }
}