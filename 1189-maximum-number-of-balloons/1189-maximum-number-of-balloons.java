class Solution {
    public int maxNumberOfBalloons(String text) {
      /*  HashMap<Character,Integer> map=new HashMap<>();
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
       }*/
          int b=0,a=0,l=0,o=0,n=0;
          for(char c:text.toCharArray()){
            if(c=='b')b++;
            else if(c=='a')a++;
            else if(c=='o')o++;
            else if(c=='l')l++;
            else if(c=='n')n++;
          }
          return  Math.min(b,Math.min(a,Math.min(o/2,Math.min(n,l/2))));
        
    
       
    }
}