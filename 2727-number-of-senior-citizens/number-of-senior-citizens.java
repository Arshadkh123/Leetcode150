class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++){
             int n=Integer.valueOf(details[i].substring(11,13));
             if(n>60){
            c++;
          }
        }
       
        
        
        return c;
    }
}