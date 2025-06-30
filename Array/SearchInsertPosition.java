class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for(; i<=nums.length-1;i++){
            if(nums[nums.length-1]<target){
                i = nums.length;
                break;
            }
            else if(target<nums[0]){
                i = 0;
                break;
            }
            else if(nums[i] == target){
                break;
            }
            else if(nums[i]<target && nums[i+1]>target){
                i++;
                break;
            }
           
        }
        return i;
    }
}
