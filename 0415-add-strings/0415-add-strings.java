class Solution {
    public String addStrings(String num1, String num2) {
        int n=num1.length(),m=num2.length();
        StringBuilder b=new StringBuilder();
        int c=0;
        for(var i=0;i<Math.max(n,m);i++){
          int x = (n-1-i>=0)?num1.charAt(n-1-i)-'0':0;
            int t = (m-1-i>=0)?num2.charAt(m-1-i)-'0':0;
           
            int sum=x+t+c;
            c=sum/10;
            b.append((sum%10)+"");
        }
        if(c!=0)b.append(c);
        return b.reverse()+"";
    }
}