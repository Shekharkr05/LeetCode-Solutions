class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set=new HashSet<>();
        for(var i:word.toCharArray())set.add(i);
        int c=0;
        for(char x='a';x<='z';x++){
            if(set.contains(x)&&set.contains(Character.toUpperCase(x)))c++;
        }
        return c;
    }
}