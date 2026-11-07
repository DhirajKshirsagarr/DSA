public class gridway {
    public static int countWay(int row,int col,int i,int j) {
        //muje (i,j) se (n-1,m-1) tak jane ke wayes
        if(i==row-1 && j==col-1){
            return 1;
        }else if(i>row-1 || j>col-1){
            return 0;
        }
        //for right
        int right=countWay(row, col, i, j+1);
        //for down
        int down=countWay(row, col, i+1, j);

        return right+down;
        
    }
   
    public static void main(String[] args) {
        int noRow=3;
        int noCol=3;
        System.out.println(countWay(noRow,noCol,0,0));
    }
}
