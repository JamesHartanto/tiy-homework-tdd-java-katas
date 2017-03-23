import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by JamesHartanto on 3/23/17.
 */
public class noTriplesTest {
    @Test
    /**
     * Given an array of integers of length 4
     * When there is a triple(value appears three times in a row)
     * Return false
     */
    public void thereIsATripleReturnFalse(){
        // Arrange
        int[] array = new int[4];
        boolean answer;
        // Act
        Arrays.fill(array, 1);
        answer = noTriples.noTriplesMethod(array);
        // Assert
        assertThat(false,equalTo(answer));
    }

    @Test
    /**
     * Given an array of integers of length 4
     * When there is no triple
     * Return true
     */
    public void thereIsNoTripleReturnTrue(){
        // Arrange
        int[] array = new int[]{1,2,3,4};
        boolean answer;
        // Act
        answer = noTriples.noTriplesMethod(array);
        // Assert
        assertThat(true,equalTo(answer));
    }

    @Test
    /**
     * Given an array of integers of length 2
     * When there is no triple
     * Return true
     */
    public void arrayLength2ThereIsNoTripleReturnTrue(){
        // Arrange
        int[] array = new int[]{1,2};
        boolean answer;
        // Act
        answer = noTriples.noTriplesMethod(array);
        // Assert
        assertThat(true,equalTo(answer));
    }
}
