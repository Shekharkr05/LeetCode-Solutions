class Solution {

    public boolean isPalindrome(String s) {
        StringBuilder b=new StringBuilder();
        for(var i:s.toCharArray())if(Character.isLetterOrDigit(i))b.append(Character.toLowerCase(i));
        String x=b+"";
        int i=0,j=x.length()-1;
        while(i<j){
           if(x.charAt(i)!=x.charAt(j))return false;
           i++;
           j--;
        }
     return true;
    }
}