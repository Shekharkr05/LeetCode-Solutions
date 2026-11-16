class Solution {
    public int countPrefixes(String[] words, String s) {
        var c=0;
        for(var i:words)if(s.startsWith(i))c++;
        return c;
        
    }
}