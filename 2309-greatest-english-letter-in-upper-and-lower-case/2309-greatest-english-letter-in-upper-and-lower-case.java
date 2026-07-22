class Solution {
    public String greatestLetter(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toUpperCase(s.charAt(i));

            if (s.indexOf(Character.toUpperCase(ch)) != -1 &&
                s.indexOf(Character.toLowerCase(ch)) != -1) {

                if (ans.length() == 0 || ch > ans.charAt(0)) {
                    ans = ch + "";
                }
            }
        }

        return ans;
    }
}