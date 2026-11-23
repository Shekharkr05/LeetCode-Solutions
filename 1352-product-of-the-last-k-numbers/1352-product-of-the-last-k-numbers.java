class ProductOfNumbers {
List<Integer> list=new ArrayList<>();
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        
        list.add(num);
        
    }
    
    public int getProduct(int k) {
        if(list.size()==0)return 0;
        int pro=1,t=list.size();
        for(int i=t-k;i<t;i++)pro*=list.get(i);
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */