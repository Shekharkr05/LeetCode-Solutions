class Solution {
    public String maximumXor(String s, String t) {
        int zcount=0,ocount=0;
        for(var i:t.toCharArray()){
            if(i=='0')zcount++;
            else ocount++;
        }
        StringBuilder b=new StringBuilder();
        for(var i:s.toCharArray()){
        if(i=='0'){
           b.append(ocount>0?"1":"0");
           ocount--;
        }else{
            b.append(zcount>0?"0":"1");
            zcount--;
        }
        }
        String k=b+"";
        b.setLength(0);
        for(var i=0;i<s.length();i++){
            b.append(((s.charAt(i)-'0')^(k.charAt(i)-'0'))+"");
        }
        return b+"";
    }
}