class Solution {
    public boolean canAliceWin(int n) {
        boolean win=false;
        int i=0;
        while(true){
            n-=10+i;
            if(n>=0)win=!win;
            else return win;
            i--;
        }
        
    }
}