class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder b=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
           b.append(s.charAt((i + k) % n));
        }
        return b+"";
    }
}