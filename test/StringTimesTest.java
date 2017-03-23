import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by JamesHartanto on 3/22/17.
 */
public class StringTimesTest {
    @Test
    /**
     * Given a string and an int
     * When int = 1, make the string as the string
     * Then return the string length
     */
    public void int1ReturnStringLength(){
        // Arrange
        String string = "Hello!";
        int number;
        // Act
        number = 1;
        String stringAnswer = StringTimes.multiplyString(string, number);

        // Assert
        assertThat(string.length()*number,equalTo(stringAnswer.length()));
    }

    @Test
    /**
     * Given a string and an int
     * When int = 2, make the string twice the string
     * Then return the string length
     */
    public void whenInt2ReturnTwiceStringLength(){
        // Arrange
        String string = "Hello";
        int number;

        // Act
        number = 2;
        String stringAnswer = StringTimes.multiplyString(string, number);

        // Assert
        assertThat(string.length()*number,equalTo(stringAnswer.length()));
    }

    @Test
    /**
     * Given a string and an int
     * When the int = 0
     * Then the string is empty
     */
    public void whenInt0ReturnEmptyString(){
        // Arrange
        String string = "Hello";
        int number;

        // Act
        number = 0;
        String stringAnswer = StringTimes.multiplyString(string,number);

        // Assert
        assertThat("",equalTo(stringAnswer));
        assertThat(0,equalTo(stringAnswer.length()));

    }
}
