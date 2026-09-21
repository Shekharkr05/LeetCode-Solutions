class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int arr[]=new int[n+m];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            arr[i+n]=nums2[i];
        }
        Arrays.sort(arr);
       int a= arr.length;
        if(arr.length%2!=0){
            return arr[(a-1)/2];
        }
        return (float)(arr[(a/2)-1]+arr[((a+2)/2)-1])/2;
        
    }
}