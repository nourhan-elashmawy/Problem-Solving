public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++){
                if (sum == k) {
                    count++;
                    break;
                }
                sum += nums[j];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1};
        SubarraySum obj = new SubarraySum();
        obj.subarraySum(arr, 2);
    }
}
