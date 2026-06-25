class Solution {
    public String stringHash(String s, int k) {
        StringBuilder b=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i+=k){
            char t=(char)(code(s.substring(i,k+i))+97);
            b.append(t);

        }
        return b+"";
    }
    int code(String s){
     int sum=0;
     for(int i=0;i<s.length();i++){
        sum+=s.charAt(i)-'a';

     }
     return sum%26;
    }
    
}