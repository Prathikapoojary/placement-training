public class uniquepath {
    public static int findUniquePath(int row,int col){
        int[][]dp=new int[row][col];
        for(int i=0;i<row;i++)
            dp[i][0]=1;
        for(int j=0;j<col;j++)
            dp[0][j]=1;
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[row-1][col-1];
    }
    public static void main(String[] args) {


        
        int row=3, col=7;
        System.out.println(findUniquePath(row, col));
        int row1=2; int col1=3;
        System.out.println(findUniquePath(row1, col1));
        int row2=2; int col2=4;
        System.out.println(findUniquePath(row2, col2));


    }
    
}

