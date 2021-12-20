class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
        int[] r = new int[nums1.length + nums2.length];
        int i = 0, j=0, k=0;
        int sum = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                
                r[k++] = nums1[i++];
            }
            else{
                
                r[k++] += nums2[j++];
            }
        }
        while(i < nums1.length){
            r[k++] = nums1[i++];
        }
        while(j < nums2.length){ 
            r[k++] = nums2[j++];
        }
        if(r.length % 2 == 0){
            return (r[(r.length/2)- 1] + r[(r.length/2)]) / 2.0;
        }
        else 
            return r[(r.length/2)]; 
    }
}
