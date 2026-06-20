class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder b=new StringBuilder(s);
        while(b.indexOf(part)!=-1){
            int t=b.indexOf(part);
           int k= part.length();
           b.delete(t,t+k);
        }
       return b+""; 
    }
}