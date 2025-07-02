class Solution {
    public int maxArea(int[] height) {
        int ht;
        int width;
        int area;
        int lar = 0;

        int p1 = 0;
        int p2 = height.length - 1;

        while(p1<p2){
            ht = Math.min(height[p1], height[p2]);
            width = p2-p1;
            area = width * ht;

            if(area>lar){
                lar = area;
            }

            if(height[p1]<height[p2]){
                p1++;
            }
            else{
                p2--;
            }
        }

        return lar;
    }
}
