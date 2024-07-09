class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currenttime=0;
        double totaltime=0.0;
        for(int i=0;i<customers.length;i++){
            if(currenttime<=customers[i][0]){
                totaltime+=customers[i][1];
                currenttime=customers[i][0]+customers[i][1];
            }
            else{
                totaltime+=currenttime-customers[i][0]+customers[i][1];
                currenttime+=customers[i][1];

            }
        }
            return (totaltime/customers.length);
        }
   }
