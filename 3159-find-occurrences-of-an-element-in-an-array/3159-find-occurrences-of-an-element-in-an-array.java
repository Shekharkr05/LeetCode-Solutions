class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
        if(nums[i]==x)list.add(i);
        }
        n=queries.length;
        int t=list.size();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(t>=queries[i])arr[i]=list.get(queries[i]-1);
            else arr[i]=-1;
        }
        return arr;
    }
}