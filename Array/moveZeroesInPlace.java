class Solution {
    public void moveZeroes(int[] nums) {

        int real = 0; //pointer

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0 && i == real){
                real++;
                continue;
            }
            if(nums[i] != 0 && i>real){
                nums[real] = nums[i];
                nums[i] = 0;
                real++;
            }
            else if(nums[i] == 0){
                continue;
            }
        }
    }
}
