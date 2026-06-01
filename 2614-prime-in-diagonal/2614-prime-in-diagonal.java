class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          max=Math.max((isprime(nums[i][i]))==true?nums[i][i]:0,max);
          max=Math.max((isprime(nums[i][n-i-1]))==true?nums[i][n-i-1]:0,max);
        }
        return max;
    }
    Boolean isprime(int n){
        if(n<2)return false;

        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}