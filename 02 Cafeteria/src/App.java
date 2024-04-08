

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Bebida bebida = Bebida.crearDesdeEntrada("Cafe,");
            System.out.println(bebida);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
