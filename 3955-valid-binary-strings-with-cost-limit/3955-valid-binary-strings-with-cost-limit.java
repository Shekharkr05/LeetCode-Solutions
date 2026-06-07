class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            String t=String.format("%"+n+"s",Integer.toBinaryString(i)).replace(' ','0');
            if(t.indexOf("11")==-1){
                int sum=0;
                for(int j=0;j<t.length();j++){
                    if(t.charAt(j)=='1')sum+=j;
                }
                if(sum<=k)list.add(t);
            }
        }
        return list;
    }
}