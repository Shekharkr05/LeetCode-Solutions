class Solution {
    public int vowelConsonantScore(String s) {
        int v=0,c=0;
        var st="aeiou";
        for(var i:s.toCharArray()){
            if(Character.isLetter(i)){
            if(st.indexOf(i)!=-1)v++;
            else c++;
            }
        }
        if(c==0)return 0;
        return (int)Math.floor(v/c);
    }
}