class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        if(nums.length == 1){
            return false;
        }
        if(nums.length == 2){
            if(nums[0] == nums[1]){
                return true;
            }
            else{
                return false;
            }
        }
    
        for (int i = 1; i < nums.length-1; i++)
        {
            
            if(nums[i-1] == nums[i] || nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
