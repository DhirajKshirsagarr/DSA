public class suduko {
    public static boolean sudokoSolver(int sudoko[][],int row,int col){
        //base case
        if(row==9){
            return true;
        }

        int nextRow=row,nextCol=col+1;
        if(nextCol==9){
            nextRow=row+1;
            nextCol=0;
        }
        //for fixed no.
        if(sudoko[row][col]!=0){
            return sudokoSolver(sudoko, nextRow, nextCol);
        }

        //for non fixed values
        for(int digit=1;digit<=9;digit++){
            if(isSaif(sudoko,row,col,digit)){
                sudoko[row][col]=digit;
                if(sudokoSolver(sudoko, nextRow, nextCol)){//solution existes
                    return true;
                }
                sudoko[row][col]=0;
            }
        }


        return false;
    }
    public static boolean isSaif(int sudoko[][],int row,int col,int digit){
        //for virtical check
        for(int i=0;i<9;i++){
            if(sudoko[i][col]==digit){
                return false;
            }
        }
        //for horizontal check
        for(int i=0;i<9;i++){
            if(sudoko[row][i]==digit){
                return false;
            }
        }
        //for 3X3 grid check
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoko[i][j]==digit){
                    return false;
                }
            }
        }


        return true;
    }

    public static void printSuduko(int sudoko[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoko[i][j]+" ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoko[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };
        
        if(sudokoSolver(sudoko,0,0)){
            System.out.println("Solution exist");
            printSuduko(sudoko);
        }else{
            System.out.println("solution dose not exist");
        }
    }
}