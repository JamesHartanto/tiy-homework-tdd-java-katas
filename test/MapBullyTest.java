import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by JamesHartanto on 3/22/17.
 */
public class MapBullyTest {

    @Test
    /**
     * Given a hashmap
     * When three key-value pairs are created, a b c
     * Then the set of keys are returned
     */
    public void threeABCKeysCreatedAndReturned() {
        // Arrange
        HashMap<String, String> mapBullyHashMap = new HashMap<>();

        // Act
        mapBullyHashMap.put("a", "");
        mapBullyHashMap.put("b", "");
        mapBullyHashMap.put("c", "");
        HashSet<String> keys = new HashSet<>();
        keys.add("a");
        keys.add("b");
        keys.add("c");

        // Assert
        assertThat(mapBullyHashMap.keySet(), equalTo(keys));
    }

    @Test
    /**
     * Given a hashmap with three key-value pairs
     * When b takes a's value
     * Then a has no more value, b has a's value, and return hashmap
     */
    public void ABCHasValueBTakesAValue() {
        // Arrange
        HashMap<String, String> mapBullyHashMap = new HashMap<>();
        mapBullyHashMap.put("a", "candy");
        mapBullyHashMap.put("b", "dirt");
        mapBullyHashMap.put("c", "meh");

        // Act
        MapBully mapBully = new MapBully();
        mapBully.steal(mapBullyHashMap);

        // Assert
        assertThat(mapBullyHashMap.get("a"), equalTo(""));
        assertThat(mapBullyHashMap.get("b"), equalTo("candy"));
    }

    @Test
    /**
     * Given a Hashmap where b has nothing
     * When steal method is invoked
     * Then b takes away a's value
     */
    public void stealMethodWhenBStartsWithNothing(){
        // Arrange
        HashMap<String, String> mapBullyHashMap = new HashMap<>();
        mapBullyHashMap.put("a","lol");
        mapBullyHashMap.put("b","");
        mapBullyHashMap.put("c","haha");

        // Act
        MapBully mapBully = new MapBully();
        mapBully.steal(mapBullyHashMap);

        // Assert
        assertThat(mapBullyHashMap.get("a"), equalTo(""));
        assertThat(mapBullyHashMap.get("b"), equalTo("lol"));
    }

    @Test
    /**
     * Given a hashmap where "a" does not exist
     * When steal method invoked
     * Then b steals nothing
     */
    public void stealNothingCuzADoesNotExist(){
        // Arrange
        HashMap<String, String> mapBullyHashMap = new HashMap<>();
        mapBullyHashMap.put("b","");
        mapBullyHashMap.put("c","haha");

        // Act
        MapBully mapBully = new MapBully();
        mapBully.steal(mapBullyHashMap);

        // Assert
        assertThat(mapBullyHashMap.get("b"), equalTo(""));

    }
}