import java.util.HashMap;

/**
 * @author Alex Hardewig
 * @date 08/05/2018
 */
public class TwoSum {



    public int[] twoSum(int[] nums, int target){
        int[] answer = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];

            if (hashMap.containsKey(difference)) {
                answer[0] = hashMap.get(difference);
                answer[1] = i;
                return answer;
            }

                hashMap.put(nums[i], i);
        }
        return null;
    }





}
