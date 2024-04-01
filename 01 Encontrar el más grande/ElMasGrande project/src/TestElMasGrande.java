import static org.junit.Assert.assertEquals;
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
    
}
