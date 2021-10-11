package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        //Task implementation
        int subLength = 0;

        for (int s = 0; s < checkString.length(); s++) {
            StringBuilder sb = new StringBuilder();
            String subString = "";
            String currChar = "";

            for (int e = s; e < checkString.length(); e++) {
                currChar = checkString.substring(e,e+1);
                if (subString.contains(currChar)) {
                    break;
                }
                subString = sb.append(checkString.charAt(e)).toString();
            }
            subLength = Math.max(subLength,sb.length());
            s += subString.indexOf(currChar);
        }

        return subLength;
    }
}
