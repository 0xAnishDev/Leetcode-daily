//To brush java concepts and check for any better approach 
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        else if(target>nums[nums.length-1]){
            return nums.length;
        }
        int h = nums.length-1;
        int m;
        int l = 0;
        while(h >= l){
            m = l +(h-l)/2;
            if(target == nums[m]){
                return m;
            }
            else if(target>nums[m]){
                l = m+1;
            }
            if(target<nums[m]){
                h = m-1;
            }
        }
        
        return l;
    }
}
