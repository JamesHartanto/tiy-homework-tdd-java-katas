import java.util.HashMap;

/**
 * Created by JamesHartanto on 3/22/17.
 */
public class MapBully {
    HashMap<String,String> hashMap = new HashMap<>();

    // Steal method - takes a's value and gives it to b
    public static HashMap<String,String> steal(HashMap<String,String> hashMap) {
        String valueA = hashMap.get("a");
        if (valueA != null) {
            hashMap.put("b", valueA);
            hashMap.put("a", "");
            return hashMap;
        }
        return hashMap;
    }
}
