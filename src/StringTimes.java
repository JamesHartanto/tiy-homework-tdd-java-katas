/**
 * Created by JamesHartanto on 3/23/17.
 */
public class StringTimes {
    public static String multiplyString(String s, int n){
        String answer = "";
        for (int x = 0; x < n; x = x + 1){
            answer = answer + s;
        }
        return answer;
    }
}
