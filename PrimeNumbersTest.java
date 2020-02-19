import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        int primeArray[] = {2,3,5,7,11};
        p.computePrimes(5);

        for(int i=0; i<primeArray.length; i++){
            System.out.print("Prime at index "+i);
            assertEquals(primeArray[i], p.getNext());
            System.out.println("");
        }
    }
}