package lib.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import lib.ElMasGrande; // Add this line

public class TestElMasGrande{
    
    @Test
    public void testLargestAtBegginning() {
        int[] arr = {5, 3, 2, 1, 4};
        int result = ElMasGrande.largest(arr);
        assertEquals(5, result);
    }
    
}
