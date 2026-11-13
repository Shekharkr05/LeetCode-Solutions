class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int k=nums.length;
        int earr[]=new int[(k+1)/2];
        int oarr[]=new int[k/2];
        int t1=0,t2=0;
        for(int i=0;i<k;i++){
            if(i%2==0)earr[t1++]=nums[i];
            else oarr[t2++]=nums[i];
        }
        Arrays.sort(earr);
        Arrays.sort(oarr);
        t1=0;t2--;
        for(var i=0;i<k;i++){
            if(i%2==0)nums[i]=earr[t1++];
            else nums[i]=oarr[t2--];
        }
        return nums;
    }
}