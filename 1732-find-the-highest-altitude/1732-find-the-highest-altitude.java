class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length,max=0,temp=0;
        for(int i=0;i<n;i++){
            temp+=gain[i];
          max=Math.max(max,temp);
          
        }
        return max;
    }
}