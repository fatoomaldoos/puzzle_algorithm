package com.company;
import java.util.ArrayList;
public class State
{
    public boolean win=false;
    boolean solve =true;
    public boolean canMove(Grid grid , int mark , Side side)
    {
        boolean result=false;
        ArrayList<Integer> res = new ArrayList<>();
        if (side==Side.DOWN){
            for (int k=0;k<4;k++){
                for (int j=0;j<4;j++){
                    if(grid.list_grid[k][j]!=null && grid.list_grid[k][j].mark==mark){
                        if(k!=3 && ( grid.list_grid[k+1][j]==null || grid.list_grid[k+1][j].mark==grid.list_grid[k][j].mark)){
                            res.add(1);
                        }
                        else {res.add(0);}
                    }
                }
            }
        }
        //____________________________________________________________________________
        else  if (side==Side.UP){
            for (int k=0;k<4;k++){
                for (int j=0;j<4;j++){
                    if(grid.list_grid[k][j]!=null &&grid.list_grid[k][j].mark==mark){
                        if(k!=0 && ( grid.list_grid[k-1][j]==null || grid.list_grid[k-1][j].mark==grid.list_grid[k][j].mark)){
                            res.add(1);
                        }
                        else {res.add(0);}
                    }
                }
            }
        }
        //________________________________________________________________________________
        else if (side==Side.LEFT){
            for (int k=0;k<4;k++){
                for (int j=0;j<4;j++){
                    if(grid.list_grid[k][j]!=null &&grid.list_grid[k][j].mark==mark){
                        if(j!=0 && ( grid.list_grid[k][j-1]==null || grid.list_grid[k][j-1].mark==grid.list_grid[k][j].mark)){
                            res.add(1);
                        }
                        else {res.add(0);}
                    }
                }
            }
        }

        //___________________________________________________________________________________
        else  if (side==Side.RIGHT){
            for (int k=0;k<4;k++){
                for (int j=0;j<4;j++){
                    if(grid.list_grid[k][j]!=null &&grid.list_grid[k][j].mark==mark){
                        if(j!=3 && ( grid.list_grid[k][j+1]==null || grid.list_grid[k][j+1].mark==grid.list_grid[k][j].mark)){
                            res.add(1);
                        }
                        else {res.add(0);}
                    }
                }
            }
        }
        int l = res.size();
        for(int t=0;t<l;t++){
            if (res.get(t)==1){
                result=true;
            }
            else{
                result=false;
                break;
            }
        }
        return result;
    }
    //____________________________________End of canMove________________________________

    public Grid move (int mark , Grid grid , Side side){
        if (side==Side.DOWN){
            for (int k=3;k>-1;k--){
                for(int j=0;j<4;j++){
                    if (grid.list_grid[k][j]!=null&&grid.list_grid[k][j].mark==mark){
                        grid.list_grid[k+1][j]=grid.list_grid[k][j];
                        grid.list_grid[k][j]=null;
                    }
                }
            }
        }
        //__________________________________________________________________________
        if (side==side.UP){
            for (int k=0;k<4;k++){
                for(int j=0;j<4;j++){
                    if (grid.list_grid[k][j]!=null&&grid.list_grid[k][j].mark==mark){
                        grid.list_grid[k-1][j]=grid.list_grid[k][j];
                        grid.list_grid[k][j]=null;
                    }
                }
            }
        }
        //___________________________________________________________________________
        if (side==side.LEFT){
            for (int k=0;k<4;k++){
                for(int j=0;j<4;j++){
                    if (grid.list_grid[k][j]!=null&&grid.list_grid[k][j].mark==mark){
                        grid.list_grid[k][j-1]=grid.list_grid[k][j];
                        grid.list_grid[k][j]=null;
                    }
                }
            }
        }
        //____________________________________________________________________________
        if (side==side.RIGHT){
            for (int k=0;k<4;k++){
                for(int j=3;j>-1;j--){
                    if (grid.list_grid[k][j]!=null&&grid.list_grid[k][j].mark==mark){
                        grid.list_grid[k][j+1]=grid.list_grid[k][j];
                        grid.list_grid[k][j]=null;
                    }
                }
            }
        }
        return grid;
    }
//_______________________________End of move_________________________________

    public boolean isWin(Grid grid){
        if
        (
                grid.list_grid[3][3]!=null &&grid.list_grid[3][3].mark==1 &&
                grid.list_grid[3][3].type==Type.HAVE_GOAL
        )
            win=true;
        else
            win=false;
        return win;
    }
//_______________________________End of isWin()_________________________________
        public boolean check (Grid grid)
        {
            boolean result=true;
            if(isWin(grid))
            {
                System.out.println("!!_______Congradulations_______!!");
                result= false;
            }
            else
                {
                result= true;
                }
            return result;
        }
//________________________________End of check()__________________________________________

}
