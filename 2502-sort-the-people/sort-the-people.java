class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> heightToNameMap = new HashMap<>();
       
        for(int i=0;i<n;i++){
            heightToNameMap.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String sortedNames[]=new String[n];

         for(int i=n-1;i>=0;i--){
            sortedNames[n-i-1]=heightToNameMap.get(heights[i]);
        }
        
        return sortedNames;
    
    }
}