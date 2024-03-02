class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=m-1,k=n-1,r=m+n-1;
        while(j>=0&&k>=0){
            if(nums1[j]>nums2[k]){
                nums1[r]=nums1[j];
                j--;
                r--;
            }
            else{
                nums1[r]=nums2[k];
                k--;
                r--;
            }

        }
        while(k>=0){
            nums1[r]=nums2[k];
            k--;
            r--;
        }
    }
}