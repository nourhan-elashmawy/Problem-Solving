import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int complement;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if(map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}