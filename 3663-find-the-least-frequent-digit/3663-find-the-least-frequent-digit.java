class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        String y=n+"";
        int min=Integer.MAX_VALUE,val=0;
        for(int i=0;i<y.length();i++)map.put(y.charAt(i),map.getOrDefault(y.charAt(i),0)+1);
        
         for(Character key:map.keySet()){
            if(map.get(key)<min){
                min=map.get(key);
                val=key-'0';
            }else if(map.get(key)==min){
                val=Math.min(val,key-'0');
            }
         }
          return val;  
    }
}