class Solution {
    public int compareVersion(String version1, String version2) {
        String a[]=version1.split("\\.");
        String b[]=version2.split("\\.");
        for(int i=0;i<Math.max(a.length,b.length);i++){
           int first=(a.length>i)?Integer.parseInt(a[i]):0;
           int second=(b.length>i)?Integer.parseInt(b[i]):0;
           if(first>second)return 1;
           if(first<second)return -1;

        }
        
        return 0;
    }
}