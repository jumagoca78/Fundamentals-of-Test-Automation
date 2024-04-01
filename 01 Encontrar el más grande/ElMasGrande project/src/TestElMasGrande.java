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

    
}
