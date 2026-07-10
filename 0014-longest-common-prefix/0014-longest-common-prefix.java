class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        StringBuilder b=new StringBuilder();
        Arrays.sort(strs);
        for(int i=0;i<Math.min(strs[0].length(),strs[strs.length-1].length());i++){
           if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i))return b+"";
           else b.append(strs[0].charAt(i));
        }
        return b+"";
    }
}