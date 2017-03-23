/**
 * Created by JamesHartanto on 3/23/17.
 */
public class StringSplosion {
    public static String crazyString(String string) {
        String answer = "";
        String store = "";
        for (int x = 0; x < string.length(); x = x + 1){
            store = store + string.charAt(x);
            answer = answer + store;
        }
        return answer;
    }
}
