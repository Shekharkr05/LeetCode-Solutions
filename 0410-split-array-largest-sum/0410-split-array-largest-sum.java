class Solution {
    public int splitArray(int[] arr, int k) {
       long n=arr.length;
        if(n<k)return -1;
        long l= Integer.MIN_VALUE;
        long r= 0;
        for(var i=0;i<arr.length;i++){
            l=Math.max(l,arr[i]);
            r+=arr[i];
        }
        long ans=r;
        while(l<r){
            long mid=l+(r-l)/2;
            if(isPossible(arr,mid,k)){
               r=mid;
               ans=mid;
            }else l=mid+1;
        }
            return (int)ans;
        
            
        
    }
    boolean isPossible(int arr[],long mid,int k){
        int count=1,sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                sum=arr[i];
                count++;
            }else sum+=arr[i];
        }
        return count<=k;
    }

}