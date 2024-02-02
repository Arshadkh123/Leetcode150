class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //creating Map to store the sorted character used as a key
        Map<String, List<String>> mp =new HashMap<>();
        for(String s:strs){
         char arr[]=s.toCharArray();
         Arrays.sort(arr);
         String sorted= new String(arr);// taking sorted string
         if(!mp.containsKey(sorted)){
             mp.put(sorted, new LinkedList<String>());
         }
         mp.get(sorted).add(s);
        }

        return new LinkedList<>(mp.values());
    }
}