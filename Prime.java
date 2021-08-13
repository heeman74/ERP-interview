
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

class Prime {
    int[] initialPrimeNum = { 1, 2, 3, 5, 7 };

    public ArrayList<Integer> eratosthenesPrimeNumbers(int num) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            boolean isPrime = false;
            for (int j = 0; j < initialPrimeNum.length; j++) {
                if (i == initialPrimeNum[j]) {
                    isPrime = true;
                    break;
                }
                if (i > initialPrimeNum[j] && initialPrimeNum[j] > 1) {
                    if (i % initialPrimeNum[j] == 0) {
                        break;
                    }
                }
                isPrime = true;
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;

    }

    // I tried to implement unit test but I was keep getting No tests found mathing
    // error
    @Test
    public void testPrime() {
        ArrayList<Integer> test1 = new ArrayList<Integer>();
        test1.add(1);
        assertEquals(test1, eratosthenesPrimeNumbers(1));
    }

}
