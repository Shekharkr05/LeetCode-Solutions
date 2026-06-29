class Solution {
    public int numOfStrings(String[] patterns, String word) {
        var count=0;
        for(var i:patterns)if(word.indexOf(i)!=-1)count++;
        return count;
    }
}