 import java.util.ArrayList;
import java.util.List;

public class BebidaMensajes {



    /**
     * @param entrada
     * @return
     */
    public static String validarEntrada(String entrada) {
        entrada = entrada.replaceAll("\\s+", ""); // Elimina espacios en blanco
        String[] partes = entrada.split(",");
        
        if (partes.length < 2) {
            return "Error: Formato de entrada inválido. Se requiere al menos un tamaño.";
        }

        String nombre = partes[0];
        if (!nombre.matches("[a-zA-Z]{2,15}")) {
            return "Error: Nombre de bebida inválido.";
        }

        List<Integer> tamanos = new ArrayList<>();
        for (int i = 1; i < partes.length; i++) {
            try {
                int tamano = Integer.parseInt(partes[i]);
                if (tamano < 1 || tamano > 48) {
                    return "Error: Tamaño " + tamano + " fuera de rango.";
                }
                if (i > 1 && tamano <= tamanos.get(i - 2)) {
                    return "Error: Los tamaños deben estar en orden ascendente.";
                }
                tamanos.add(tamano);
            } catch (NumberFormatException e) {
                return "Error: Uno de los tamaños proporcionados no es un número válido.";
            }
        }

        if (tamanos.size() > 5) {
            return "Error: No se pueden ingresar más de cinco tamaños.";
        }
        return "OK"; // Indica que la entrada es válida
    }

    
}
