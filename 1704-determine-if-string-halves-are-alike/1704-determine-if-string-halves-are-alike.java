class Solution {
    public boolean halvesAreAlike(String s) {
        int a=0,count=0,n=s.length()-1;
        String v="aeiou";
        for(var i:s.toCharArray()){
            if(v.indexOf(Character.toLowerCase(i))!=-1){
                if(a<=n/2)count++;
                else count--;
            }

            a++;
        }
        return count==0;
    }
}