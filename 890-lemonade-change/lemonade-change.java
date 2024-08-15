class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fivedollar=0,tendollar=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fivedollar+=1;
            }
            else if(bills[i]==10){
                if(fivedollar>=1){
                fivedollar-=1;
                tendollar+=1;
                }
                else{
                    return false;
                }                
            }
            else if(bills[i]==20){
               if(fivedollar>=1 && tendollar>=1){
                 fivedollar--;
                 tendollar--;
               }
               else if(fivedollar>=3){
                fivedollar-=3;
               }
               else {
                return false;
               }
               
            }
            else{
                System.out.print("Invalid input");
            }
        }
        return true;
    }
}