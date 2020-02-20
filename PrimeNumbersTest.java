import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

//import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    PrimeNumbers p;
    @BeforeEach
    void setUp() {
        p = new PrimeNumbers();
    }

    @AfterEach
    void tearDown() {
        p=null;
    }

    @Test
    void computePrimes() {
        int primeAry[] = {2, 3, 5, 7, 11};
        p.computePrimes(5); // Compute the first 5 prime numbers
        for (int i = 0; i < primeAry.length; i++)
        {
            assertTrue("computePrimes: fail at element " + i, p.getNext() == primeAry[i]);
            System.out.println("computePrimes: prime number " + (i+1) + " passed");
        }
    
    }
}