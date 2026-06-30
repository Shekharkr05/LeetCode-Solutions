class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(var i:nums)list2.add(i);
       while (!list2.isEmpty()) {
    List<Integer> temp = new ArrayList<>();
    HashSet<Integer> seen = new HashSet<>();

    Iterator<Integer> it = list2.iterator();
//here we had a problem we can not able to remove element while travising so we need iterator
    while (it.hasNext()) {
        int x = it.next();
        if (!seen.contains(x)) {
            seen.add(x);
            temp.add(x);
            it.remove();   // Safe removal
        }
    }

    list.add(temp);
}
return list;
    }
}