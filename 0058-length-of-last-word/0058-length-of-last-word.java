class Solution {
    public int lengthOfLastWord(String s) {
        String x[]=s.split("\\s+");
        return x[x.length-1].length();
    }
}