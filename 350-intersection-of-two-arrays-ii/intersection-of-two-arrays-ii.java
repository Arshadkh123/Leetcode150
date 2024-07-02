class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        // Step 2: Use two pointers to find intersection
        List<Integer> resultList = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                resultList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        // Step 3: Convert List to int[] for return
        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }
        
        return result;
    }
}