class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        var sum=0;
        for(int i:nums){
            if(i>9)sum+=encry(i);
            else sum+=i;
        }
        return sum;
    }
    int encry(int x){
        int max=0;
        int b=0;
        while(x>0){
            max=Math.max(max,x%10);
            b++;
            x=x/10;
        }
        return Integer.parseInt((max+"").repeat(b));
    }
}