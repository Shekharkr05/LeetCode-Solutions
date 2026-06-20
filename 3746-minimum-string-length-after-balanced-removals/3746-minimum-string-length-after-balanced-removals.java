class Solution {
    public int minLengthAfterRemovals(String s) {
       /* StringBuilder b=new StringBuilder(s);
        while(true){
             int t=b.indexOf("ab");
            if(t!=-1){
           b.delete(t,t+2);
            continue;
        }
        int k=b.indexOf("ba");
         if(k!=-1){
            b.delete(k,k+2);
            continue;
        }
        break;
        }
        
        
        return b.length();*/
        // gives tle error
        Stack<Character> st=new Stack();
        for(char c:s.toCharArray()){
            if(!st.isEmpty()&&st.peek()!=c)st.pop();
            else st.push(c);
        }
        return st.size();
    }
}