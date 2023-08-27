package com.company;

public class Grid implements Comparable<Grid>
{
    public Shape[][]list_grid=new Shape[4][4];
    public int step=0;
    public int manhattanDistance;
    public int comp;
    public void printGrid()
    {
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++)
            {
                if (this.list_grid[i][j]!=null)
                {
                    this.list_grid[i][j].print();
                }

                else
                    {
                    System.out.print("n  ");
                    }

            }
            System.out.println();
        }
    }
//___________________________End of printGrid()_______________________________________
    public void equal (Grid grid) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                this.list_grid[i][j] = grid.list_grid[i][j];
            }
        }
    }
//___________________________End of eq()_______________________________________________
    public boolean isEqual (Grid grid)
    {
        boolean result=true;
        for (int i=0 ; i<4 ; i++){
            for (int j=0 ;j<4;j++){
                if( this.list_grid[i][j]!=grid.list_grid[i][j])
                {
                    result=false;
                }
            }
        }
        return result;
    }
//_____________________________________End of isEqual()______________________________
    @Override
    public int compareTo(Grid grid)
    {
       if(this.comp<grid.comp)
           return 1;
        else if(this.comp==grid.comp)
            return 0;
        //if(this.comp>grid.comp)
       else return -1;

    }
//_________________________End of isEqual()_____________________________________


}
