class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int N =rowSum.length;
        int M=colSum.length;
        int [][] orgmatx=new int[N][M];
        int i=0,j=0;
        while(i<N && j<M ){
            orgmatx[i][j]=Math.min(rowSum[i],colSum[j]);

            rowSum[i]-=orgmatx[i][j];
            colSum[j]-=orgmatx[i][j];

            if(rowSum[i]==0){
                i++;
            }else{
                j++;
            }
        }
        return orgmatx;
    }
}