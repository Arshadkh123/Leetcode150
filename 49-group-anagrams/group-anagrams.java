class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //creating Map to store the sorted character used as a key
        Map<String, List<String>> mp =new HashMap<>();
        for(String s:strs){
         char freq[]=new char[26];
         //Arrays.sort(arr);
         for(char val:s.toCharArray()){
             freq[val-'a']++;
         }
         String val= new String(freq);
         if(!mp.containsKey(val)){
             mp.put(val, new ArrayList<>());
         }
         mp.get(val).add(s);
        }
        //res.addAll
        return new ArrayList<>(mp.values());
    }
}