class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int max = nums.length-1;
        for(int i = 0; i<=max;){
            if(val == nums[i]){
                int temp = nums[max];
                nums[max--] = nums[i];
                nums[i] = temp;
            }
            else{
                k++;
                i++;
            }
        }
        return k;
    } 
}
