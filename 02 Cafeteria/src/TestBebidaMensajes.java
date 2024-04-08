    import org.junit.Test;
import static org.junit.Assert.*;

public class TestBebidaMensajes {
     // Prueba con entrada válida
    @Test
    public void testValidarEntrada() {
       
        assertEquals("OK", BebidaMensajes.validarEntrada("Cafe,12,24,36"));
    }

    // Prueba con entrada vacía
    @Test
    public void testCadenaVacia() {|
        
        assertEquals("Error: Formato de entrada inválido. Se requiere al menos un tamaño.", BebidaMensajes.validarEntrada(""));
    }

    // Prueba con entrada sin tamaños
    @Test
    public void testValidarEntradaErrores2() {
        
        assertEquals("Error: Formato de entrada inválido. Se requiere al menos un tamaño.", BebidaMensajes.validarEntrada("Cafe,"));
    }

    // Prueba con entrada con 6 tamaños
    @Test
    public void testValidar6Tamaños() {
        
        assertEquals("Error: No se pueden ingresar más de cinco tamaños.", BebidaMensajes.validarEntrada("Cafe,12,24,36,40,41,42"));
    }

    // Prueba con nombre de bebida inválido    
    @Test
    public void testValidarNombreInvalido() {

        assertEquals("Error: Nombre de bebida inválido.", BebidaMensajes.validarEntrada("C1,12,24,36"));
    }

    // Prueba con tamaños fuera de rango >48
    @Test
    public void testValidarTamañoFueraDeRango() {     
        assertEquals("Error: Tamaño 50 fuera de rango.", BebidaMensajes.validarEntrada("Cafe,12,24,50"));
    }
    
    // Prueba con tamaños igual a 48
    @Test
    public void testValidarTamaño48() {
        assertEquals("OK", BebidaMensajes.validarEntrada("Cafe,12,24,48"));
    }

    // Prueba con tamaños igual a 48 +1
    @Test
    public void testValidarTamaño48Mas1() {
        assertEquals("Error: Tamaño 49 fuera de rango.", BebidaMensajes.validarEntrada("Cafe,12,24,49"));
    }

    // Prueba con tamaños igual a 48 -1
    @Test
    public void testValidarTamaño48Menos1() {
        assertEquals("OK", BebidaMensajes.validarEntrada("Cafe,12,24,47"));
    }

    // Prueba con tamaños igual a 1
    @Test
    public void testValidarTamaño1() {
        assertEquals("OK", BebidaMensajes.validarEntrada("Cafe,1,12,24"));
    }

    // Prueba con tamaños fuera de rango <1
    @Test
    public void testValidarTamañoFueraDeRangoMenor1() {
        assertEquals("Error: Tamaño 0 fuera de rango.", BebidaMensajes.validarEntrada("Cafe,0,12,24"));
    }

    // Prueba con tamaños no en orden ascendente
    @Test
    public void testValidarTamañosNoEnOrdenAscendente() {
        assertEquals("Error: Los tamaños deben estar en orden ascendente.", BebidaMensajes.validarEntrada("Cafe,12,24,20"));
    }
     
    // Prueba con más de cinco tamaños
    @Test
    public void testValidarMasDeCincoTamaños() {
        assertEquals("Error: No se pueden ingresar más de cinco tamaños.", BebidaMensajes.validarEntrada("Cafe,12,24,30,38,40,45"));
    }

    // Prueba con UN TAMAÑO
    @Test
    public void testValidarUnTamaño() {
        assertEquals("OK", BebidaMensajes.validarEntrada("Cafe,12"));
    }

    // Prueba SIN TAMAÑO
    @Test
    public void testValidarSinTamaño() {
        assertEquals("Error: Formato de entrada inválido. Se requiere al menos un tamaño.", BebidaMensajes.validarEntrada("Cafe"));
    }

    // Prueba con tamaño DECIMAL
    @Test
    public void testValidarTamañoDecimal() {
        assertEquals("Error: Uno de los tamaños proporcionados no es un número válido.", BebidaMensajes.validarEntrada("Cafe,12.0,24"));
    }

    // Prueba con tamaño no numérico
    @Test
    public void testValidarTamañoNoNumerico() {
        assertEquals("Error: Uno de los tamaños proporcionados no es un número válido.", BebidaMensajes.validarEntrada("Cafe,12,24,treinta"));
    }

    // Prueba con nombre con espacios
    @Test
    public void testValidarNombreConEspacios() {
        assertEquals("OK", BebidaMensajes.validarEntrada("Cafe con leche,12,24"));
    }

    // Prueba con nombre con caracteres especiales
    @Test
    public void testValidarNombreConCaracteresEspeciales() {
        assertEquals("Error: Nombre de bebida inválido.", BebidaMensajes.validarEntrada("Café,12,24"));
    }

    // Prueba con nombre con numeros con espacios
    @Test
    public void testValidarNumerosConEspacios() {
        assertEquals("OK", BebidaMensajes.validarEntrada("Cafe,12,2 4"));
    }
}