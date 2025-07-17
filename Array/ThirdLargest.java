import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            if(nums[0]>nums[1]){
                return nums[0];
            }
            else{
                return nums[1];
            }
        }
        int distinct = 1;
        
        for(int i = nums.length-1;i>0;i--){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else{
                distinct++;
            }

            if(distinct == 3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}
