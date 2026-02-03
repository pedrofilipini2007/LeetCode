class Solution {
    public int search(int[] nums, int target) {
        int max_index = nums.length - 1;
        int min_index = 0;


        while (min_index <= max_index){
            int mid = min_index + (max_index - min_index) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid] > target){
                max_index = mid - 1;
            }
            else {
                min_index = mid + 1;
            }
        }
        return -1;
    }
}
