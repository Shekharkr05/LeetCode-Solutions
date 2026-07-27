class Solution {
    public int searchInsert(int[] arr, int target) {
       /* int x=Arrays.binarySearch(nums,target);
        return x<0?Math.abs(x)-1:x;*/
        int left=0,right=arr.length-1;
        int mid=right/2;
        
        while(left<=right){
            mid=left+(right-left)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target)left=mid+1;
            else right=mid-1;
        }

        return left;
    }
}