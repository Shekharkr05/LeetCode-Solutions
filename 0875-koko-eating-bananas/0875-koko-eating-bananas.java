class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      /*int max = piles[0], n = piles.length;
        for (var i = 1; i < n; i++)
            max = Math.max(piles[i], max);
        int l = 1;
        int r = max;
        int ans = max;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long totalHr = 0;
            for (int i = 0; i < n; i++) {
                totalHr += piles[i] / mid;
                totalHr += ((piles[i] % mid) != 0) ? 1 : 0;
            }
            if (totalHr > h)
                l = mid + 1;
            else {
                r = mid - 1;
                ans = mid;
            }

        }
        return ans;*/

          int max = piles[0], n = piles.length;
        for (var i = 1; i < n; i++)
            max = Math.max(piles[i], max);
        int l = 1;
        int r = max;
       
        while (l <r) {
            int mid = l + (r - l) / 2;
            long totalHr = 0;
            for (int i = 0; i < n; i++) {
                totalHr += piles[i] / mid;
                totalHr += ((piles[i] % mid) != 0) ? 1 : 0;
            }
            if (totalHr > h)
                l = mid + 1;
            else {
                r = mid;
               
            }

        }
        return l;
    }
}