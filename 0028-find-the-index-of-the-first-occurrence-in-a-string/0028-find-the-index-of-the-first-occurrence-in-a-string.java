class Solution {
    public int strStr(String haystack, String needle) {
        int i, j;
        for(int left=0; left<haystack.length(); left++){
            i=left;
            j=0;
            while(i<haystack.length()&&j<needle.length()
            &&haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            if(j==needle.length())
                return left;
        }
        return -1;
    }
}