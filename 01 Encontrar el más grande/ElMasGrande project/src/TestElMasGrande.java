import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestElMasGrande{
    
    @Test
    public void testLargestAtBegginning() {
        int[] array = {5, 4, 3, 2, 1};
        assertEquals(5, ElMasGrande.largest(array));
    }
    
}
