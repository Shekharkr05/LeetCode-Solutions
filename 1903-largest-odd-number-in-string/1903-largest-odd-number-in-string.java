class Solution {
    public String largestOddNumber(String num) {
        StringBuilder b=new StringBuilder(num);
        for(var i=b.length()-1;i>=0;i--){
            if(((b.charAt(i))-'0')%2!=0)return b+"";
            else b.deleteCharAt(i);
        }
        return b+"";
    }
}