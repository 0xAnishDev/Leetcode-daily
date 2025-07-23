class Solution {
    public boolean searchMatrix(int[][] arr, int k) {
        boolean found = false;
        int columns = arr[0].length-1;
        int targetrow = 0;

        if(k<arr[0][0]){
            return found;
        }
        if(k>arr[arr.length-1][arr[0].length-1]){
            return found;
        }

        while(targetrow <= arr.length-1){
            if(arr[targetrow][0] == k || arr[targetrow][columns] == k){
                found = true;
                return found;
            }

            if(k>arr[targetrow][0] && k<arr[targetrow][columns]){
                int start = 0;
                int end = arr[0].length-1;
                while(!found && end>=start){
                    int mid = (start+end)/2;
                    if(arr[targetrow][mid] == k){
                        found = true;
                        return found;
                    }   
                    if(arr[targetrow][mid]>k){
                        end = mid-1;
                    }
                    if(k>arr[targetrow][mid]){
                        start = mid+1;
                    }
                }
                return found;
            }


            targetrow++;
        }

        return found;
    }
}
