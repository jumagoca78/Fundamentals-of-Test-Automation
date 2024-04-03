import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestElMasGrande{
    
    @Test
    public void testLargestAtBegginning() {
        int[] array = {5, 4, 3, 2, 1};
        assertEquals(5, ElMasGrande.largest(array));
    }

    @Test
    public void testLargestAtEnd() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(5, ElMasGrande.largest(array));
    }

    @Test
    public void testLargestInMiddle() {
        int[] array = {1, 2, 5, 4, 3};
        assertEquals(5, ElMasGrande.largest(array));
    }
    
    @Test
    public void testLargestWithNegativeNumbers() {
        int[] array = {-1, -2, -5, -4, -3};
        assertEquals(-1, ElMasGrande.largest(array));
    }

    @Test
    public void testLargestWithNegativeAndPositiveNumbers() {
        int[] array = {-1, 2, -5, 4, -3};
        assertEquals(4, ElMasGrande.largest(array));
    }

    @Test   
    public void testLargestWithEmptyArray() {
        int[] array = {};
        try {
            ElMasGrande.largest(array);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("IllegalArgumentException expected");
    }        

    @Test

    public void testLargestWithOneElement() {
        int[] array = {1};
        assertEquals(1, ElMasGrande.largest(array));
    }

    @Test
    public void testLargestWithTwoElements() {
        int[] array = {1, 2};
        assertEquals(2, ElMasGrande.largest(array));
    }
    
    @Test
    public void testLargestWithTwoEqualElements() {
        int[] array = {2, 2};
        assertEquals(2, ElMasGrande.largest(array));
    }

    @Test
    public void testLargestWithTwoNegativeElements() {
        int[] array = {-2, -1};
        assertEquals(-1, ElMasGrande.largest(array));
    }

    @Test
    public void testLargestWithTwoNegativeEqualElements() {
        int[] array = {-2, -2};
        assertEquals(-2, ElMasGrande.largest(array));
    }
    
    //Prueba con números en un rango grande: Para asegurarse de que la función maneja correctamente números muy grandes, realiza una prueba con números que estén cerca de los límites del tipo de dato entero que estás utilizando.
    @Test
    public void testLargestWithLargeNumbers() {
        int[] array = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        assertEquals(Integer.MAX_VALUE, ElMasGrande.largest(array));
    }

    //Prueba con números que incluyan el cero: Aunque la especificación indica números enteros positivos, podría ser útil probar qué sucede si la lista incluye el 0, especialmente si hay una posibilidad de que los datos de entrada no siempre cumplan con las especificaciones.

    @Test
    public void testLargestWithZero() {
        int[] array = {0, 1, 2, 3, 4, 5};
        assertEquals(5, ElMasGrande.largest(array));
    }

    //Prueba con una secuencia ascendente y descendente: Prueba la función con una lista de números en orden ascendente y otra en orden descendente para asegurar que el orden de los elementos no afecte el resultado.

    @Test
    public void testLargestWithAscendingOrder() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(5, ElMasGrande.largest(array));
    }

    //Prueba con el número cero como el único elemento de la lista: Aunque el cero no es ni positivo ni negativo, sería útil probar cómo maneja la función una lista que contenga solo 0, especialmente si hay una posibilidad de que se presenten tales casos en los datos de entrada.
    @Test
    public void testLargestWithZeroOnly() {
        int[] array = {0};
        assertEquals(0, ElMasGrande.largest(array));
    }

    //Prueba con una lista que incluya el cero entre otros números negativos: Esta prueba verificaría si la función puede identificar correctamente que 0 es mayor que cualquier número negativo en la lista. Por ejemplo, [-1, -2, 0, -3] debería retornar 0
    @Test
    public void testLargestWithZeroAndNegativeNumbers() {
        int[] array = {-1, -2, 0, -3};
        assertEquals(0, ElMasGrande.largest(array));
    }

    /*Prueba de manejo de errores para entradas no válidas: Además de números negativos, sería prudente probar cómo maneja tu función otros tipos de entradas no válidas, 
    como valores null.*/
    @Test
    public void testLargestWithNull() {
        int[] array = null;
        try {
            ElMasGrande.largest(array);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("IllegalArgumentException expected");
    }

    //prueba de enteros positivos y negativos
    @Test
    public void testLargestWithPositiveAndNegativeNumbers() {
        int[] array = {1, 2, -5, 4, 3};
        assertEquals(4, ElMasGrande.largest(array));
    }
 
    
    //probar negativos muy grandes
    @Test
    public void testLargestWithLargeNegativeNumbers() {
        int[] array = {-1000000000, -2000000000, -5000000000, -4000000000, -3000000000};
        assertEquals(-1000000000, ElMasGrande.largest(array));
    }
}
