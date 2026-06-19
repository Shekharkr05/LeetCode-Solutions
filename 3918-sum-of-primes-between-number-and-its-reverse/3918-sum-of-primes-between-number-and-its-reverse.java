class Solution {
    public int sumOfPrimesInRange(int n) {
        int t=Math.max(reverse(n),n);
        int k=Math.min(reverse(n),n);
       int sum=0;
    for(int i=k;i<=t;i++){
       if(prime(i)==true)sum+=i;
    }
       return sum; 
    }
    int reverse(int n){
       int sum=0;
        while(n!=0){
         sum=sum*10+n%10;
         n/=10;
        }
        return sum;
    }
    boolean prime(int n){
        if(n==1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}