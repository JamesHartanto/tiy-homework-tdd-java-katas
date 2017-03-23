/**
 * Created by JamesHartanto on 3/23/17.
 */
public class noTriples {
    public static boolean noTriplesMethod(int[] nums) {
        boolean answer = true;
        if (nums.length < 3){
            answer = true;
        }else{
            for (int x = 0; x < nums.length - 2; x = x + 1){
                if (nums[x] == nums[x+1] && nums[x+1] == nums[x+2]){
                    answer = false;
                }
            }
        }return answer;
    }
}
