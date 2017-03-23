import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by JamesHartanto on 3/23/17.
 */
public class StringSplosionTest {
    @Test
    /**
     * Given a string
     * When the length of string is one
     * Then return the string
     */
    public void stringOfLengthOneReturnString(){
        // Arrange
        String string;
        // Act
        string = "J";
        String stringAnswer = string;
        // Assert
        assertThat(string,equalTo(stringAnswer));
    }

    @Test
    /**
     * Given a string
     * When the length of string is two
     * Then return the string with the first character attached
     */
    public void stringOfLengthTwoReturnString(){
        // Arrange
        String string;
        // Act
        string = "JA";
        String stringAnswer = StringSplosion.crazyString(string);
        // Assert
        assertThat("JJA",equalTo(stringAnswer));
    }

    @Test
    /**
     * Given a string
     * When the length is 5
     * Then return the string with previous string characters attached
     */
    public void stringOfLengthFiveReturnString(){
        // Arrange
        String string;
        // Act
        string = "JAMES";
        String stringAnswer = StringSplosion.crazyString(string);
        // Assert
        assertThat("JJAJAMJAMEJAMES",equalTo(stringAnswer));
    }
}
