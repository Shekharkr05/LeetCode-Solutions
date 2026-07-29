class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        var count=0;
        HashMap<Character,Integer> map=new HashMap<>();
      if(s1.length()!=s2.length())return false;
        for(var i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))count++;
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s1.length();i++)map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
         for(char i:map.keySet())if(map.get(i)!=0)return false;
        return (count==2||count==0);
    }
}