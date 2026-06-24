class Solution {
    public List<String> validStrings(int n) {
        List<String> list=new ArrayList<>();
        int t=Integer.parseInt(("1".repeat(n)),2);
        
        for(int i=0;i<=t;i++){
            String x=Integer.toBinaryString(i);
            String y="0".repeat(n-x.length())+x;
            
          if(y.indexOf("00")==-1)list.add(y);
        }
        return list;
    }
}