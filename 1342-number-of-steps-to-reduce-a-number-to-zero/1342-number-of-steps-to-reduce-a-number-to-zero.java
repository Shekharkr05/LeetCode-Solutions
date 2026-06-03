class Solution {
    public int numberOfSteps(int num) {
        
        return cont(num,0);
    }
    int cont(int num,int count){
        if(num==0)return count;
        if (num%2==0)return cont(num/2,count+1);
        return cont(num-1,count+1);
    }
}