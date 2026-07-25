import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        } 

    
        Arrays.sort(strs);
        String start = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        while (i < start.length() && i < last.length()) {
            if (start.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return start.substring(0, i);
    }
}
