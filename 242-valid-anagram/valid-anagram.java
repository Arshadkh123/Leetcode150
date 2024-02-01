class Solution {
    public boolean isAnagram(String s, String t) {
        int m,n;
        
        m=s.length();
        n=t.length();
        if(m!=n){
            return false;
        }
        else{

          int[] a1=new int[26];
           for(int i=0;i<m;i++)
           {
               a1[s.charAt(i)-'a']++;
           }
           for(int i=0;i<n;i++){
               a1[t.charAt(i)-'a']--;
           }
           for(int i=0;i<a1.length;i++){
               if(a1[i]!=0){ 
               return false;
           }
        }
           return true;
        }
        
    }
}