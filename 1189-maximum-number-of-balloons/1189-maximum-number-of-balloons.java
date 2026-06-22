class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:text.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
       
       
       String t="balloon";
      int  count=0;
       while(true){
       for(char c:t.toCharArray()){
        if((map.getOrDefault(c,0))==0)return count;
          else  map.put(c,map.get(c)-1);
        
        
       }
       count++;
       }
       
    }
}