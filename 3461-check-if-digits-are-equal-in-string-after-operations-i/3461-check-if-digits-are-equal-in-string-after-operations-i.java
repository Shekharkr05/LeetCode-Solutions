class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();
        if(n<2)return true;
        StringBuilder b=new StringBuilder();
        
        while(s.length()>2){
        for(int i=0;i<s.length()-1;i++){
          b.append(t(s.charAt(i),s.charAt(i+1)));
        }
        s=b+"";
        b.setLength(0);
        }
        System.out.println(s);
        
        return (s.charAt(0)==s.charAt(1));
        
    }
    String t(char x,char y){
        return (((x-'0')+(y-'0'))%10)+"";
    }
}