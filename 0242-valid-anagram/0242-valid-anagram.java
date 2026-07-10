class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++)list.add(s.charAt(i));
        for(int i=0;i<t.length();i++){
            if(list.contains(t.charAt(i)))list.remove(list.indexOf(t.charAt(i)));
            else return false;
        }
        return true;
    }
}