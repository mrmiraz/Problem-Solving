class Solution {
    public int maxArea(int[] height) {
        
        int area = 0;
        int l = height.length - 1;
        int s =0;
        while(s < l){
            area = Math.max(area, Math.min(height[s], height[l])* (l - s));
            if(height[s] < height[l])
                s++;
            else 
                l--;
        }
        return area;
    }
    
}
