import java.util.Arrays;
class Solution {
    public int singleNumber(int[] arr) {
        Arrays.sort(arr);
        if(arr.length == 1){
            return arr[0];
        }
        for(int i = 0; i<=arr.length-1;i++){
            if(i == 0){
                if(arr[i] != arr[i+1]){
                    return arr[i];
                }
            }

            else if(i == arr.length-1){
                if(arr[i] != arr[i-1]){
                    return arr[i];
                }
            }
            else if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }
}
