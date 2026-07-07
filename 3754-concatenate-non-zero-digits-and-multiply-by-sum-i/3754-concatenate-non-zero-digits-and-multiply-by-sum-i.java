class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder b=new StringBuilder();
        int s=0;
        var x=(n+"");
        for(char i:x.toCharArray()){
            if(i!='0'){
                b.append(i);
                s+=(i-'0');
            }
        }
        if(b.length()==0)return 0;
        return Long.parseLong(b+"")*s;
    }
}