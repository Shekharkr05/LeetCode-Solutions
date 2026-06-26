class Solution {
    public int partitionString(String s) {
         HashMap<Character,Integer> map=new HashMap<>();
         int count=0;
        for(char i:s.toCharArray()){
           if(map.containsKey(i)){
            count++;
            map.clear();
            map.put(i,1);
           }else map.put(i,1);

        }
        return count+1;
    }
}