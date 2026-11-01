class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>>ans = new ArrayList<>();

        if(strs.length ==1){
            ans.add(List.of(strs[0]));
            return ans;
        }


        List<String> processed = new ArrayList<>();

        for(int i = 0;i<strs.length;i++){


            String temp = strs[i];

            if(processed.contains(temp)){
                continue;
            }
            List<String>sub = new ArrayList<>();
            sub.add(temp);
            processed.add(temp);
            for(int j = i+1;j<strs.length;j++){

                if(temp.length() == strs[j].length()){
                   boolean isAna = checkAnagram(temp,strs[j]);
                   if(isAna){
                     sub.add(strs[j]);
                     processed.add(strs[j]);
                   }

                }
                continue;
            }
            ans.add(sub);
        }

        return ans;
        
    }

    public boolean checkAnagram(String t , String s){

        int [] arr = new int[26];

        for(int i = 0;i<t.length();i++){

            arr[t.charAt(i) - 'a']++;
            arr[s.charAt(i) - 'a']--;
        }

        for(int i =0;i<26;i++){
            if(arr[i] !=0){
                return false;
            }
        }

        return true;
    }
}
