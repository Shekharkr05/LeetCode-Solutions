class Solution {
   
    public boolean uniformArray(int[] nums) {
        int even = 0, odd = 0;
        for (int x : nums) {
        if (x % 2 == 0)
            even++;
            else
             odd++;
        }

        
        return true;
    

    }
}