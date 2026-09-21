class Solution {
    public String reverseWords(String s) {
       String[] trimmed= s.trim().split("\\s+");
       StringBuilder reversed = new StringBuilder();
       for(int i = trimmed.length-1;i>=0;i--){
        reversed.append(trimmed[i]);
        if(i!=0){
            reversed.append(" ");
        }
       }
       return reversed.toString();
    }
}