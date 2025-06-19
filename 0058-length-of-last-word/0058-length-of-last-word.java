class Solution {
    public int lengthOfLastWord(String s) {
        boolean flag=false;
        int count=0; 
        for(int i=s.length()-1; i>=0 &&(s.charAt(i)!=' '||flag==false) ; i--){
            if(s.charAt(i)!=' '){
                count++;
                flag=true;
            }
        }
        return count;
    }
}