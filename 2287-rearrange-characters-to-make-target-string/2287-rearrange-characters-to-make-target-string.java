class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(var i:s.toCharArray())map.put(i,map.getOrDefault(i,0)+1);
        
        var count=0;
        while(true){
            for(var i:target.toCharArray()){
                if(map.getOrDefault(i,0)==0)return count;
                else map.put(i,map.get(i)-1);
                
            }
            count++;
        }
        
    }
}