class Solution {
    public String digitSum(String s, int k) {
        StringBuilder b=new StringBuilder(s);
        StringBuilder x=new StringBuilder();
        
        while(b.length()>k){
            int sum=0,t=0;
        for(int i=0;i<b.length();i++){
            sum+=b.charAt(i)-'0';
            t++;
            if(t==k){
                x.append(sum);
                sum=0;
                t=0;
            }

        }
        if(t>0)x.append(sum);
        b.setLength(0);
        b.append(x);
        x.setLength(0);
        }
        return b+"";
    }
}