class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char ch:charArr){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String result = sb.toString();
        System.out.println(result);
        String reversed = sb.reverse().toString();
        if(result.equals(reversed)){ return true;}
        return false;
    }
}