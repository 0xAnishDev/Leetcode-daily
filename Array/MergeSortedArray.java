import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0){
            return;
        }
        if(m == 0){
            for(int i = 0; i<n;i++){
                nums1[i] = nums2[i];
            }
            return;
        }

        int p2 = n-1;
        for(int i = m+n-1; i>=0; i--){
            if(nums1[i] == 0 && i>=m){
                nums1[i] = nums2[p2--];
            }
            else{
                break;
            }
        }

        Arrays.sort(nums1);
    }
}
