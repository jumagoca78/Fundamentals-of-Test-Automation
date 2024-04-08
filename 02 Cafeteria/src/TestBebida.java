import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestBebida {

    //probar que el nombre de la bebida tenga solo caracteres alfabeticos
    @Test
    public void testNombreBebidaCaracteresAlfabeticos() {
        try {
            Bebida.crearDesdeEntrada("Cafe,1");
            assertTrue(true);
        } catch (IllegalArgumentException e) {
            fail(e.getMessage());
        }
    }
    //probar que el nombre de la bebida tenga caracteres no alfabeticos

    //probar que el nombre de la bebida tenga una longitud de 2 a 15 caracteres
    @Test
    public void testNombreBebidaLongitud2a15() {
        try {
            Bebida.crearDesdeEntrada("Cafe$,5");
            fail("It should thrown an exception");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    //probar que los tamaños de la bebida esten en el rango de 1 a 48
    @Test

    public void testTamanosBebidaRango1a48() {
        try {
            Bebida.crearDesdeEntrada("Cafe,1");
            assertTrue(true);
        } catch (IllegalArgumentException e) {
            fail(e.getMessage());
        }
    }



}
