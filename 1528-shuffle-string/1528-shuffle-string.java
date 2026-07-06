class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder b=new StringBuilder();
        int j=0;
        while(b.length()!=s.length()){
        for(int i=0;i<s.length();i++){
           if(indices[i]==j){
            b.append(s.charAt(i));
           }
           
        }
        j++;
        }
        return b+"";
    }
}