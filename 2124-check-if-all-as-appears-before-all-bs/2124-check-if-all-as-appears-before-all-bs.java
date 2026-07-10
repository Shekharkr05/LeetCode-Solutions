class Solution {
    public boolean checkString(String s) {
        char b='b';
        for(var i:s.toCharArray()){
            if(i=='a'&&b=='a')return false;
            if(i=='b')b='a';
        }
        return true;
    }
}