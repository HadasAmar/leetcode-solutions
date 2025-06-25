class Solution {
    public int compress(char[] chars) {

        int left = 0, right = 0, count = 0;
        char c = ' ';

        for (int i = 0; i < chars.length; i++) {
            if (c != chars[i]) {
                c = chars[i];
                if(count>1){
                char[] digits = Integer.toString(count).toCharArray();
                for(int j=0; j<digits.length; j++)
                    chars[left++]=digits[j];
                }
                chars[left++] = c;
                count=1;
            } else
                count++;
        }
        if(count>1){
            char[] digits = Integer.toString(count).toCharArray();
                for(int j=0; j<digits.length; j++)
                    chars[left++]=digits[j];
        }
        
        return left;
    }
}