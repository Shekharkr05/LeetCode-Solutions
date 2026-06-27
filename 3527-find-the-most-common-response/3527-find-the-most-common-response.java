class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map=new HashMap<>();
       
        for(int i=0;i<responses.size();i++){
             HashSet<String> set=new HashSet<>(responses.get(i));
        for(var j:set){
            map.put(j,map.getOrDefault(j,0)+1);
        }
           
         }
         var max=0;
         var s="";
        // do with entery set()
        for(var i:map.keySet()){
            int k=map.get(i);
            if(max<k){
                max=k;
                s=i;
            }else if(max==k&&i.compareTo(s)<0){
              s=i;
            }
        }
        return s;
        
    }
}