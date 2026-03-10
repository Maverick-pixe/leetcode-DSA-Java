class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
         if (s.length() < p.length()) return result;
        int[] freq = new int[26];
        int[] window = new int[26];
        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }
        for(int i = 0; i < p.length(); i++){
           window[s.charAt(i) - 'a']++;
       } 
       int k = p.length();
        if(Arrays.equals(freq,window)){
            result.add(0);
        }
        for(int i= k;i<s.length();i++){
            window[s.charAt(i) - 'a']++;
            window[s.charAt(i-k)-'a']--;

            if(Arrays.equals(freq,window)){
                result.add(i-k+1);
            }
        }
   return result;
    }
}