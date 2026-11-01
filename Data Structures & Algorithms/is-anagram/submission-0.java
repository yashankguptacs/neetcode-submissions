class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int [] arr = new int[26];
        int [] crr = new int[26];

        for(char c : s.toCharArray()){

            arr[c-'a']++;
        }

        for(char c: t.toCharArray()){

            crr[c-'a']++;
        }

        for(char c : t.toCharArray()){

            if(arr[c-'a']>0 && arr[c-'a']==crr[c-'a']){
                continue;
            }

            return false;
        }

        return true;

        

    }
}
