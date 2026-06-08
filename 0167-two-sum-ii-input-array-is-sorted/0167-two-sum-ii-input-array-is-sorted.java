class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int start=0,end=numbers.length-1;
       while(start<end){
        int f=numbers[start]+numbers[end];
        if(f==target)return new int[] {start+1,end+1};
        else if(f>target)end--;
        else start++;
       }
       return new int[] {-1,-1};
    }
}