class Solution {
    public String reverseWords(String s) {
        String t[]=s.trim().split("\\s+");
         int fir=vowel(t[0]);
         StringBuilder b=new StringBuilder(t[0]);
         for(var i=1;i<t.length;i++){
           if(vowel(t[i])==fir){
            StringBuilder bu=new StringBuilder(t[i]).reverse();
            String m=bu+"";
            b.append(" "+m);
           }else b.append(" "+t[i]);
         }
         return b+"";
        
    }
    int vowel(String s){
        String k="aeiou";
        int count=0;
        for(var i:s.toCharArray())if(k.indexOf(i)!=-1)count++;
        return count;
    }
}